package com.brainacad.module2.lesson17;

import java.util.Arrays;
import java.util.Random;

/*
Open project called TestThread2.
Rewrite classes to provide the same functionality by implement the Runnable interface
 (calculates sum of myArray elements in two separate thread and then print result to console).
  Execute the program. The program output must be like next example: [324,234,523,…,643]
  Sum of array elements: 123457
 */
public class Lab4 {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 1000;
        final int RANDOM_RANGE = 1000;

        int[] myArray = new int[SIZE_ARRAY];
        Random r = new Random();
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = r.nextInt(RANDOM_RANGE);

        System.out.println(Arrays.toString(myArray));

        System.out.println("---------------------------------------------------------------------------------");
        MySumCountRunnable myObj_1 = new MySumCountRunnable();
        myObj_1.setMyArray(myArray);
        myObj_1.setStartIndex(0);
        myObj_1.setStopIndex(myArray.length / 2);
        Thread myThread_3 = new Thread(myObj_1);

        MySumCountRunnable myObj_2 = new MySumCountRunnable();
        myObj_2.setMyArray(myArray);
        myObj_2.setStartIndex(myArray.length / 2 + 1);
        myObj_2.setStopIndex(myArray.length - 1);
        Thread myThread_4 = new Thread(myObj_2);

        try {
            myThread_3.start();
            myThread_4.start();

            myThread_3.join();
            myThread_4.join();
        } catch (InterruptedException ee) {
        }

        System.out.println(myObj_1.getResultSum() + myObj_2.getResultSum());
    }
}
