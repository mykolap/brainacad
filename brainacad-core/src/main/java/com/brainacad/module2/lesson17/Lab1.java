package com.brainacad.module2.lesson17;

/**
 * Created by Admin on 12/3/2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        Runnable myTimeBombRunnable = () -> {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Boom!!!");
        };

        Thread myTimeBomb = new Thread(myTimeBombRunnable);
        myTimeBomb.start();
    }
}
