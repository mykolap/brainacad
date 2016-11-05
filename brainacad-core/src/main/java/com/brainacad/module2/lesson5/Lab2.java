package com.brainacad.module2.lesson5;

import java.util.Arrays;

/*
Create class “MyInit” with field “arr”of array of integers
and non-static initialization block which will initialize
that array with random values. (Size of array is 10)
To generate random numbers you can use next code:
arr[i]= (int) (100 * Math.random()).
(Or using Random class instance and nextInt() method invocation).
Add to class MyInit and method “printArray()” which will print
values of this array.
Create class Main, which will create two instances of class MyInit
and invoke method “printArray()” to print values
of their arrays on console.

Example of output:
23,43,11,34,78,59,34,61,24,2
5,48,50,3,1,4,67,62,78,98
 */
public class Lab2 {
    public static void main(String[] args) {
        MyInit myInit = new MyInit();
        Integer[] rememberArr = myInit.getArr();
        MyInit myInit2 = new MyInit();
        Integer[] rememberArr2 = myInit2.getArr();

        System.out.println(Arrays.deepToString(myInit.getArr()));

        System.out.println(Arrays.toString(myInit2.getArr()));

        System.out.println(Arrays.toString(rememberArr));
        System.out.println(Arrays.toString(rememberArr2));
    }
}
