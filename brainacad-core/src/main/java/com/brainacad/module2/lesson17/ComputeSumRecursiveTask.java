package com.brainacad.module2.lesson17;

import java.util.concurrent.RecursiveTask;

/**
 * Created by Alex on 12/10/2016.
 */
class ComputeSumRecursiveTask extends RecursiveTask<Long> {
    private static final int MINIMUM_DIVIDED_TASK = 20;
    //private static final int MINIMUM_DIVIDED_TASK = 20; //for test
    private int[] array;
    private int fromIndex;
    private int toIndex;

    public ComputeSumRecursiveTask(int[] array, int fromIndex, int toIndex) {
        this.array = array;
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
    }

    public Long compute() {
        if ((toIndex - fromIndex + 1) <= MINIMUM_DIVIDED_TASK) {
            long localSum = 0;
            for (int i = fromIndex; i <= toIndex; i++) {
                localSum += array[i];
                //System.out.println("sum element " + i); //for test
            }
            //System.out.printf("\t Summing of range %d to %d is %d %n", fromIndex, toIndex, localSum); // for test
            return localSum;
        } else {
            int mid = (fromIndex + toIndex) / 2;
            //System.out.printf("Forking into two ranges: %d to %d and %d to %d %n", fromIndex, mid, mid+1, toIndex); //for test
            ComputeSumRecursiveTask firstHalf = new ComputeSumRecursiveTask(array, fromIndex, mid);
            firstHalf.fork();
            ComputeSumRecursiveTask secondHalf = new ComputeSumRecursiveTask(array, mid + 1, toIndex);
            long resultSecond = secondHalf.compute();
            return firstHalf.join() + resultSecond;
        }
    }
}
