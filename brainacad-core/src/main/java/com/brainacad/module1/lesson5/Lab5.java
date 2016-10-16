package com.brainacad.module1.lesson5;

/**
 Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
 Also compute and display the average. The output shall look like:
 The Sum is: 100
 The Avg is: 10
 */
public class Lab5 {

    private int n;

    public Lab5(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        Lab5 lab5 = new Lab5(6);
        System.out.println("sum: " + lab5.sum());
        System.out.println("avg: " + lab5.avg());
    }

    private double avg() {
        return (double)sum()/n;
    }

    private int sum() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
