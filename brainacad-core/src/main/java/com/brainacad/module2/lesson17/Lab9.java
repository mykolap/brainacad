package com.brainacad.module2.lesson17;

/*
Create new project called TestDeadLock. Add package “com.brainacad.oop.testdeadlock1”. 1)
Create a class MyThread which extends Thread class.
2) Create a class MyObject.
3) Create a class Main with a main() method.
Provide code which simulates DeadLock using three MyThread objects (threads)
and three MyObject objects (used for synchronization).
4) Execute the program several times. The program output must be like next example:
Thread 1: Holding lock 1... Thread 3: Holding lock 3...
Thread 2: Holding lock 2... Thread 1: Waiting for lock 2...
Thread 3: Waiting for lock 1... Thread 2: Waiting for lock 3...
 */
public class Lab9 {
    public static void main(String[] args) {

        final MyObject object1 = new MyObject("Data 1");
        final MyObject object2 = new MyObject("Data 2");
        final MyObject object3 = new MyObject("Data 3");


        Thread thread1 = new MyThread("Thread_1", object1, object2, object3);
        Thread thread2 = new MyThread("Thread_2", object2, object3, object1);
        Thread thread3 = new MyThread("Thread_3", object3, object1, object2);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}


