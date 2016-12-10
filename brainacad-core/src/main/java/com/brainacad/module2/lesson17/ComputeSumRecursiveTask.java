package com.brainacad.module2.lesson17;

import java.util.concurrent.RecursiveTask;

class ComputeSumRecursiveTask extends RecursiveTask<Long> {
    private final int devideTo;
    private int[] array;
    private int fromIndex;
    private int toIndex;
    private boolean testMode;

    public ComputeSumRecursiveTask(int[] array, int fromIndex, int toIndex, int devideTo, boolean testMode) {
        this.array = array;
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
        this.testMode = testMode;
        this.devideTo = devideTo;
    }

    @Override
    public Long compute() {
        if ((toIndex - fromIndex) < devideTo) {
            long localSum = 0;
            for (int i = fromIndex; i <= toIndex; i++) {
                localSum += array[i];
                if (testMode) {
                    System.out.println("sum element " + i);
                }
            }
            if (testMode) {
                System.out.printf("\t Summing of range %d to %d is %d %n", fromIndex, toIndex, localSum); // for test
            }
            return localSum;
        } else {
            int mid = (fromIndex + toIndex) / 2;
            if (testMode) {
                System.out.printf("Forking into two ranges: %d to %d and %d to %d %n",
                        fromIndex, mid, mid + 1, toIndex); //for test
            }
            ComputeSumRecursiveTask firstHalf = new ComputeSumRecursiveTask(array, fromIndex, mid, devideTo, testMode);
            firstHalf.fork();
            ComputeSumRecursiveTask secondHalf = new ComputeSumRecursiveTask(array, mid + 1, toIndex, devideTo, testMode);
            long resultSecond = secondHalf.compute();
            return firstHalf.join() + resultSecond;
        }
    }
}
