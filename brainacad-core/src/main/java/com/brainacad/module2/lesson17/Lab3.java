package com.brainacad.module2.lesson17;

import java.util.Arrays;
import java.util.Random;

/*
Create new project called TestThread2. Add package “com.brainacad.oop.testthread2”.
1. Create a class MySumCount which extends the Thread class.
Add to class MySumCount two integer fields startIndex and stopIndex with setters and getters.
Add to class MySumCount new field as array of integer type and setter for it.
Add to class MySumCount new field resultSum of long type and getter for it.
2. Override the run() method of Thread.
Add code to calculate sum of array elements from startIndex to stopIndex and save result to resultSum field.
3. Create a class Main with a main() method.
Add to method main() code that declares local variable myArray as array of integer type (of 1000 size), and create two instances of MySumCount.
Add code to fill all elements of myArray with random integer values generated from 0 to 1000 range.
 Add code to calculates sum of myArray elements in two separate thread and then print result to console.
 4. Execute the program. The program output must be like next example: [324,234,523,…,643] Sum of array elements: 123457
 */
public class Lab3 {
    public static void main(String[] args) {
        final int SIZE_ARRAY = 1000;
        final int RANDOM_RANGE = 1000;

        int[] myArray = new int[SIZE_ARRAY];
        Random r = new Random();
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = r.nextInt(RANDOM_RANGE);

        System.out.println(Arrays.toString(myArray));

        MySumCount myThread_1 = new MySumCount();
        MySumCount myThread_2 = new MySumCount();

        myThread_1.setMyArray(myArray);
        myThread_2.setMyArray(myArray);
        myThread_1.setStartIndex(0);
        myThread_1.setStopIndex(SIZE_ARRAY / 2);
        myThread_2.setStartIndex(SIZE_ARRAY / 2 + 1);
        myThread_2.setStopIndex(SIZE_ARRAY - 1);

        myThread_1.start();
        myThread_2.start();
        try {
            myThread_1.join();
            myThread_2.join();
        } catch (InterruptedException e) {
        }

        System.out.println(myThread_1.getResultSum() + myThread_2.getResultSum());
    }
}
