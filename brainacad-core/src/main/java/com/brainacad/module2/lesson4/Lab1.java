package com.brainacad.module2.lesson4;

/*
Create class MyMath with two static methods (findMin and findMax),
which will take array of int values  as argument and return minimum element value (for findMin method)
or  maximum element value (for findMax method).
 */
public class Lab1 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 8};
        System.out.println("min " + MyMath.findMin(arr));
        System.out.println("max " + MyMath.findMax(arr));
    }
}
