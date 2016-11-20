package com.brainacad.module2.lesson10;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Alex on 19.11.2016.
 */
public class ClassWork {
    public static void main(String[] args) {
            int a = first();
        System.out.println("ext b " +a);
    }

    private static int first() {
        int b = 50;
        try {
            second();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //return b;
        } finally {
            //b = 100;
            System.out.println("int b " + b);
        }
        return b;
    }

    private static void second() {
            throw new RuntimeException("not bla bla");
    }
}
