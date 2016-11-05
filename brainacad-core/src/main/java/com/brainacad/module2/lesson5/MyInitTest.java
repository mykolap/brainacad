package com.brainacad.module2.lesson5;

public class MyInitTest {

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest() {
        System.out.println("constructor 1");
    }

    public MyInitTest(int arg) {
        System.out.println("constructor 2");
    }

}
