package com.brainacad.module2.lesson4;

public class MyPyramid {
    public void printPyramid(int n) {
        for (int i = n, currentRow = 1; i > 0; i--, currentRow++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= currentRow; j++) {
                System.out.print(j);
            }
            for (int j = currentRow - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
