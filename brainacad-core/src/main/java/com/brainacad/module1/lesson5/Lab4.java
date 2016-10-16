package com.brainacad.module1.lesson5;

/**
 The program must print the first 10 numbers that is divisible evenly by 3 or 4 , but the for loop iterates from 1 to 300. (so break statement must be used after 10 printed result).
 The output shall look:
 3
 4
 …
 20
 */
public class Lab4 {
    public static void main(String[] args) {
        for (int i = 1, k = 0; i <= 300; i++) {
            if (i%3 == 0 || i%4 == 0) {
                System.out.println(i);
                k++;
                if (k == 10) {
                    break;
                }
            }
        }
    }
}
