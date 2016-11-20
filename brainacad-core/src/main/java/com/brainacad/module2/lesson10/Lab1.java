package com.brainacad.module2.lesson10;

import java.util.Objects;

/**
 * Created by Alex on 19.11.2016.
 */
public class Lab1 {

    private Integer x1;
    private Integer x2;
    private Integer x3;
    private Integer x4;

    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        System.out.println("With 10");
        lab1.x1 = 10;
        lab1.x2 = new Integer(10);
        lab1.x3 = Integer.valueOf(10);
        lab1.x4 = Integer.parseInt("10");
        lab1.checkConstrains();

        System.out.println("With 500");
        lab1.x1 = 500;
        lab1.x2 = new Integer(500);
        lab1.x3 = Integer.valueOf(500);
        lab1.x4 = Integer.parseInt("500");
        lab1.checkConstrains();
    }

    private void checkConstrains() {
        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x1 == x4);

        System.out.println(Objects.equals(x1, x2));
        System.out.println(Objects.equals(x1, x3));
        System.out.println(Objects.equals(x1, x4));

    }
}
