package com.brainacad.module1.lesson5;

public class Lab1 {

    /*
     Write a program to produce on console the following :
      
     1
     2  1
     3 2  1
     4 3 2  1
     5 4 3 2  1
     6 5 4 3 2  1
     7 6 5 4 3 2  1
     8 7 6 5 4 3 2  1
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 8 ; i++) {
            for (int j = i; j > 0; j--) {
                if (j == 1) {
                    System.out.println(j);
                } else {
                    System.out.print(j + " ");
                }
            }
        }

        com.brainacad.module2.lesson1.Lab1 lab1 = null;
    }

    public void myBestFunc() {
        getParam(1, 2, false);
    }

    private int getParam(int a, int b, boolean c) {
        return 0;
    }

}
