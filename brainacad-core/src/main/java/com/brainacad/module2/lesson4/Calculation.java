package com.brainacad.module2.lesson4;

import java.util.Arrays;

public class Calculation {
    void doJob() {
        int[] arr1 = {4, 5, 7, 2};
        int[] arr2 = {6, 1, -8, 6};
        System.out.println("Min of " + Arrays.toString(arr1) + " is " + MyMath.findMin(arr1));
        System.out.println("Min of " + Arrays.toString(arr2) + " is " + MyMath.findMin(arr2));
        System.out.println("Max of " + Arrays.toString(arr1) + " is " + MyMath.findMax(arr1));
        System.out.println("Max of " + Arrays.toString(arr2) + " is " + MyMath.findMax(arr2));
    }
}
