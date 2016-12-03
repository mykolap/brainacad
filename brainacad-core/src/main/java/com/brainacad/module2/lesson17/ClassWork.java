package com.brainacad.module2.lesson17;

/**
 * Created by Admin on 12/3/2016.
 */
public class ClassWork {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous runnable do some heavy job");
            }
        }).start();

        Thread joinThread = new Thread(() -> System.out.println("lambda runnable do some heavy job"));
        joinThread.start();
        //joinThread.join();

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " do some heavy job");
            }
        };
        thread.setName("my cool thread");
        thread.start();

        Thread.sleep(1_000);

        System.out.println("End");
    }
}
