package com.brainacad.module2.lesson17;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumOfNUsingForkJoin {
    private static final int NUM_THREADS = 10;
    private static int N = 40;

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        int[] myArray = createArrayInt(N);

        // for test
        System.out.println(Arrays.toString(myArray));

        long sum = pool.invoke(new RecSumOfN(myArray, 0, N));
        System.out.println("Sum = " + sum);
    }

    public static int[] createArrayInt(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        return array;
    }

    static class RecSumOfN extends RecursiveTask<Long> {
        int[] array;
        int from, to;

        public RecSumOfN(int[] array, int from, int to) {
            this.array = array;
            this.from = from;
            this.to = to;
        }

        public Long compute() {
            if ((to - from) < 20) {
                long localSum = 0;
                for (int i = from; i < to; i++) {
                    localSum += array[i];
                }
                System.out.printf("\t Summing of range %d to %d is %d %n",
                        from, to, localSum);
                return localSum;
            } else {
                int mid = (from + to) / 2;
                System.out.printf("Forking into two ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);
                RecSumOfN firstHalf = new RecSumOfN(array, from, mid);
                firstHalf.fork();
                RecSumOfN secondHalf = new RecSumOfN(array, mid, to);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }
        }
    }
}