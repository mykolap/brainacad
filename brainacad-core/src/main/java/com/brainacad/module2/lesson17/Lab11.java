package com.brainacad.module2.lesson17;

import java.util.Arrays;
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

    public static void main(String[] args) {
        long testSum = createPoolAndExecute(5, false,
                true, 2);
        long randomSum = createPoolAndExecute(1_000_000,
                true, false, 20);
        System.out.println("Test sum = " + testSum);
        System.out.println("Test sum = " + randomSum);
    }

    public static long createPoolAndExecute(int sizeOfArray,
                                            boolean isRandom,
                                            boolean testMode,
                                            int devideTo
    ) {
        ForkJoinPool pool = new ForkJoinPool();
        int[] myArray = createArrayInt(sizeOfArray, isRandom);

        if (testMode) {
            System.out.println(Arrays.toString(myArray)); //for test
        }

        ComputeSumRecursiveTask computeSumRecursiveTask = new ComputeSumRecursiveTask(myArray,
                0,
                sizeOfArray - 1,
                devideTo,
                testMode);
        return pool.invoke(computeSumRecursiveTask);
    }

    public static int[] createArrayInt(int size, boolean isRandom) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            if (isRandom) {
                array[i] = random.nextInt(100);
            } else {
                array[i] = i;
            }
        }
        return array;
    }

}
