package com.brainacad.module2.lesson17;

public class Printer extends Thread {
    private final Storage storage;
    private int number;

    public Printer(Storage storage, int number) {
        this.storage = storage;
        this.number = number;
    }

    public void run() {
        try {
            for (int i = 0; i < number; i++)
                synchronized (storage) {
                    if (!storage.isFlag()) {
                        storage.wait();
                    }
                    System.out.println(storage.getValue());
                    storage.setFlag(false);
                    storage.notify();
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
