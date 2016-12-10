package com.brainacad.module2.lesson17;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/*
 Create new project called TestForkJoin. Add package “com.brainacad.oop.testforkjoin”.
 1) Create a program to calculate sum all the elements of an array (of 1000000 integer elements,
 which values generated randomly form 0 to 100), using ForkJoin framework.
 2) Create a RecursiveTask for dividing the array into two parts and assign each part to another RecursiveTask
 for further dividing. Continue dividing the array and stop dividing when the array has less than 20 elements.
  Execute the program.
 */
public class Lab11 {

    public static final int SIZE_OF_ARRAY = 1_000_000;
    //public static final int SIZE_OF_ARRAY = 5; //for test

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int[] myArray = createArrayInt(SIZE_OF_ARRAY);

        //System.out.println(Arrays.toString(myArray)); for test

        long sum = pool.invoke(new ComputeSumRecursiveTask(myArray, 0, SIZE_OF_ARRAY - 1));
        System.out.println("Sum = " + sum);
    }

    public static int[] createArrayInt(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            //array[i] = i; //for test
        }
        return array;
    }

}
