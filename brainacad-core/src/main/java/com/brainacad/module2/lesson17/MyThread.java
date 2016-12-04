package com.brainacad.module2.lesson17;

public class MyThread extends Thread {

    String threadName;
    MyObject obj1;
    MyObject obj2;
    MyObject obj3;

    public MyThread(String str, MyObject obj1, MyObject obj2, MyObject obj3) {
        threadName = str;
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void run() {
        synchronized (obj1) {
            obj1.order(obj3);
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }

        synchronized (obj2) {
            obj2.order(obj1);
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }

        synchronized (obj3) {
            obj3.order(obj2);
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }
}

