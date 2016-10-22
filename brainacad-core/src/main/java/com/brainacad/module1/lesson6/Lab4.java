package com.brainacad.module1.lesson6;

import java.util.Arrays;

/**
 Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.
 */
public class Lab4 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 8};
        Arrays.sort(arr);
        int pos = Arrays.binarySearch(arr, 3);
        System.out.println("number 3 located in position " + pos + " in array " + Arrays.toString(arr));
    }
}
