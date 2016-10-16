package com.brainacad.module1.lesson5;

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
public class Lab3 {

    private int maxNumber;
    private int columnWidth;

    public Lab3(int maxNumber, int columnWidth) {
        this.maxNumber = maxNumber;
        this.columnWidth = columnWidth;
    }

    public static void main(String[] args) {
        Lab3 lab3_9 = new Lab3(9, 3);
        System.out.println(lab3_9.getPifagorTable());

        Lab3 lab3_3 = new Lab3(3, 3);
        System.out.println(lab3_3.getPifagorTable());

        Lab3 lab3_12 = new Lab3(12, 4);
        System.out.println(lab3_12.getPifagorTable());
    }

    public String getPifagorTable() {
        String table = "";
        for (int i = 0; i <= maxNumber; i++) {
            for (int j = 0; j <= maxNumber; j++) {
                table += getColumn(i, j);
            }
        }
        return table;
    }

    private String getColumn(int i, int j) {
        String columnValue;
        if (j == 0) {
            columnValue = getZeroColumn(i);
        } else if (j == maxNumber) {
            columnValue = getLastColumn(i, j);
        } else {
            columnValue = getRegularColumn(i, j);
        }
        return columnValue;
    }

    private String getZeroColumn(int i) {
        String zeroColumn = (i == 0) ? "*" : String.valueOf(i);
        return getFormattedColumn(zeroColumn, columnWidth - 2) + " |";
    }

    private String getLastColumn(int i, int j) {
        String columnValue = getRegularColumn(i, j) + "\n";
        if (i == 0) {
            for (int k = 0; k <= maxNumber; k++) {
                for (int l = 0; l < columnWidth; l++) {
                    columnValue += "-";
                }
            }
            columnValue += "\n";
        }
        return columnValue;
    }

    private String getRegularColumn(int i, int j) {
        String columnValue;
        if (i == 0) {
            columnValue = getFormattedNumber(j);
        } else {
            columnValue = getFormattedNumber(i * j);
        }
        return columnValue;
    }

    String getFormattedNumber(int number) {
        return getFormattedColumn(String.valueOf(number), columnWidth);
    }

    private String getFormattedColumn(String value, int width) {
        String dest = value;
        while (dest.length() < width) {
            dest = " " + dest;
        }
        return dest;
    }

}
