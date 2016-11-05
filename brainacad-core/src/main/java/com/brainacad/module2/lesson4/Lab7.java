package com.brainacad.module2.lesson4;

/*
Write a program that computes the distance an object will fall in Earth's gravity.
Create a new class called GravityCalculator with method calcDist(double t)
that takes double  t, and returns the the position of an object
after falling for t seconds (outputting the position in meters). The formula in Math notation is:
x(t) = 0.5 × at 2 + vit + xi
Where:
a - Acceleration (m/s 2 ) =-9.81
t - Time (s) (for example t=10)
vi Initial velocity (m/s) =0
xi Initial position =0
Declare Acceleration value field as a constant;
 */
public class Lab7 {
    public static void main(String[] args) {
        GravityCalculator gravityCalculator1 = new GravityCalculator();
        System.out.println("after 100 sec " + gravityCalculator1.calcDist(100));
        GravityCalculator gravityCalculator2 = new GravityCalculator(10, 100_000);
        System.out.println("after 100 sec " + gravityCalculator2.calcDist(100));
    }
}
