package com.brainacad.module2.lesson4;

public class MyPyramid {
    public void printPyramid(int n) {
        System.out.println(getPyramid(n));
    }

    private String getPyramid(int n) {
        String str = "";
        for (int currentRow = 1; currentRow <= n; currentRow++) {
            str += getLine(currentRow, n);
            str += "\n";
        }
        return str;
    }

    private String getLine(int currentRow, int n) {
        String str = "";
        for (int j = 0; j < n - currentRow; j++) {
            str += " ";
        }
        for (int j = 1; j <= currentRow; j++) {
            str += j;
        }
        for (int j = currentRow - 1; j > 0; j--) {
            str += j;
        }
        return str;
    }
}
