package com.brainacad.module2.lesson16;

public class Lab5 {
    public static void main(String[] args) {
        byte b = 5;
        foo(b);
        foo(5);

        System.out.println("------------");
        Byte bb = new Byte("5");
        foo(bb);
    }

    private static void foo(int value) {
        System.out.println("int");
    }

    private static void foo(byte value) {
        System.out.println("byte");
    }
}
