package com.brainacad.module1.lesson6;

import org.apache.commons.math3.stat.descriptive.rank.Median;

import java.util.Arrays;

/**
 * There are statistics for the year by months as an array:
 * <p>
 * int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * <p>
 * Write code which calculates the maximum value from the array, the minimum value, the average and the median.
 */
public class Lab2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        Lab2 lab2 = new Lab2();
        System.out.println(lab2.maximum(m));
        System.out.println(lab2.minimum(m));
    }

    public int maximum(int[] arr) {
        int maximum;
        if (arr.length > 0) {
            maximum = arr[0];
        } else {
            throw new UnsupportedOperationException("Cannot get maximum for empty array");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return maximum;
    }

    public int minimum(int[] arr) {
        int minimum;
        if (arr.length > 0) {
            minimum = arr[0];
        } else {
            throw new UnsupportedOperationException("Cannot get minimum for empty array");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public double median(int[] arr) {
        Arrays.sort(arr);
        int middle = arr.length / 2;
        if (arr.length % 2 == 0) {
            long left = arr[middle - 1];
            long right = arr[middle];
            return (left + right) / 2.0;
        } else {
            return arr[middle];
        }
    }

}
