package com.brainacad.module2.lesson17;

/**
 * Created by Admin on 12/3/2016.
 */
public class ClassWork {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        double d = 1.45;
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        System.out.println(Math.rint(d));

        double n = Math.pow(Math.E, 2);
        System.out.println(n);

        double nexp = Math.exp(2);
        System.out.println(nexp);

        double log = Math.log(7.38);
        System.out.println(log);

        System.out.println(Math.toRadians(90));

        /*
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
        */
    }
}
