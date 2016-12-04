package com.brainacad.module2.lesson17;

import java.util.Arrays;

/*
 1) Rewrite the DiningHall class so that after the makePizza() method is called 10 times,
 the servePizza() method is called once each from 20 different threads.
 2) Insert synchronization to eliminate data races in your code, if any exist.
 3) Describe what data races may occur in your multithreaded code without synchronization.
 */
public class Lab6 {
    public static void main(String[] args) {
        final DiningHall diningHall = new DiningHall();
        for (int i = 0; i < 10; i++) {
            diningHall.makePizza();
        }

        Thread[] arrayStudents = new Thread[20];
        for (int i = 0; i < arrayStudents.length; i++) {
            arrayStudents[i] = new Thread(diningHall::servePizza);
        }

        Arrays.stream(arrayStudents).forEach(Thread::start);
    }
}
