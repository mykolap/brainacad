package com.brainacad.module2.lesson4;

public class MyMath {

    public static final double PI = 3.14;

    public static int findMin(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int findMax(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static double areaOfCircle(double radius) {
        return PI * Math.pow(radius, 2.0);
    }
}
