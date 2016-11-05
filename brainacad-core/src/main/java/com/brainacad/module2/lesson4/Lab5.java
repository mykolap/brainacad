package com.brainacad.module2.lesson4;

/*
The value of π can be calculated with the series:
π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
Write a class MyCalc with public static method calcPi(int)
that takes as parameter an integer n, and computes
and returns the value of π approximated to the first n terms of the series.
 */
public class Lab5 {
    public static void main(String[] args) {
        System.out.println(MyCalc.calcPi(1));
        System.out.println(MyCalc.calcPi(2));
        System.out.println(MyCalc.calcPi(4));
        System.out.println(MyCalc.calcPi(8));
        System.out.println(MyCalc.calcPi(16));
        System.out.println(MyCalc.calcPi(32));
        System.out.println(MyCalc.calcPi(64));
        System.out.println(MyCalc.calcPi(128));
        System.out.println(MyCalc.calcPi(256));
        System.out.println(MyCalc.calcPi(512));
        System.out.println(MyCalc.calcPi(1024));
    }
}
