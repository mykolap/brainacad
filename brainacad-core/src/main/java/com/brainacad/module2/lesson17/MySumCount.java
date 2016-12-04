package com.brainacad.module2.lesson17;

public class MySumCount extends Thread {
    private int startIndex,
            stopIndex;
    private int[] myArray;
    private long resultSum;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {
        if (stopIndex < startIndex ||
                startIndex >= myArray.length ||
                stopIndex >= myArray.length ||
                startIndex < 0 || stopIndex < 0) {
            System.out.println("Indexes are not correct!");
            return;
        }
        for (int i = startIndex; i <= stopIndex; i++) {
            resultSum += myArray[i];
        }
        try {
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " the sum of computation is completed!");
        } catch (InterruptedException e) {
        }
    }
}
