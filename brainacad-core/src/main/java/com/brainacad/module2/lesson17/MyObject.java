package com.brainacad.module2.lesson17;

public final class MyObject {
    public final String name;

    public MyObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void order(MyObject object) {
        System.out.println(((MyThread) Thread.currentThread()).threadName +
                " Holding lock " + this.name + "...");
        object.reply();

    }

    public synchronized void reply() {
        System.out.println(((MyThread) Thread.currentThread()).threadName +
                " Got lock " + this.name + "...");
    }
}

