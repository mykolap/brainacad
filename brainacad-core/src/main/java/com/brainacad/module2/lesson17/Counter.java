package com.brainacad.module2.lesson17;

public class Counter extends Thread {
    private final Storage storage;
    private int number;

    public Counter(Storage storage, int number) {
        this.storage = storage;
        this.number = number;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < number; i++)
                synchronized (storage) {
                    while (storage.isFlag()) {
                        storage.wait();
                    }
                    storage.setValue(i);
                    storage.setFlag(true);
                    //System.out.println("Send notify from counter " + i);
                    storage.notify();
                }
        } catch (InterruptedException e) {
        }
    }
}
