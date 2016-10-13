package com.brainacad.module1.lesson5;

public class Lab3 {

    /*
    Write a program to produce the multiplication table of 1 to 9 as shown
    using two nested for-loops:
     * |  1  2  3  4  5  6  7  8  9
    -------------------------------
     1 |  1  2  3  4  5  6  7  8  9
     2 |  2  4  6  8 10 12 14 16 18
     3 |  3  6  9 12 15 18 21 24 27
     4 |  4  8 12 16 20 24 28 32 36
     5 |  5 10 15 20 25 30 35 40 45
     6 |  6 12 18 24 30 36 42 48 54
     7 |  7 14 21 28 35 42 49 56 63
     8 |  8 16 24 32 40 48 56 64 72
     9 |  9 18 27 36 45 54 63 72 81
         */
    public static void main(String[] args) {
        final Lab3 lab3 = new Lab3();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println(lab3.getColumn(i, j));
            }
        }
    }

    private String getColumn(int i, int j) {
        String columnValue;
        if (j == 0) {
            columnValue = getZeroColumn(i);
        } else if (j == 9) {
            columnValue = getLastColumn(i, j);
        } else {
            columnValue = getRegularColumn(i, j);
        }
        return columnValue;
    }

    private String getZeroColumn(int i) {
        String zeroColumn = (i == 0) ? "*" : String.valueOf(i);
        return zeroColumn + " | ";
    }

    private String getLastColumn(int i, int j) {
        String columnValue = getRegularColumn(i, j) + "\n";
        if (i == 0) {
            columnValue += "-------------------------------\n";
        }
        return columnValue;
    }

    private String getRegularColumn(int i, int j) {
        String columnValue;
        if (i == 0) {
            columnValue = " " + j;
        } else {
            columnValue = " " + i * j;
        }
        return columnValue;
    }

    protected int getLengthOfDigit(int i) {
        return (int) (Math.log10(i) + 1);
    }

}
