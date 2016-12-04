package com.brainacad.module2.lesson16;

public class Lab2 {
    public static void main(String[] args) {
        byte bb = 10;
        foo(bb);

        System.out.println("------------------");
        foo(new Byte("78"));
    }

    private static void foo(Byte b) {
        System.out.println("Byte");
    }

    private static void foo(int value) {
        System.out.println("int");
    }
}
