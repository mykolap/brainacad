package com.brainacad.module1.lesson6;

import java.util.Arrays;

/*
Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.
 */
public class Lab1 {
    public static void main(String[] args) {
        final int UPPER_BOUND = 30;
        int[] arr = new int[UPPER_BOUND/2];
        for (int i = 2, index = 0; i <= UPPER_BOUND; i+=2, index++) {
            arr[index] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
