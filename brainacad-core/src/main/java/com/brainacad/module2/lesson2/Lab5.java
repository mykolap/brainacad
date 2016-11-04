package com.brainacad.module2.lesson2;

/*
•	Write class A with overridden methods calcSquare that calculate square of rectangle,
square of foursquare and square of circle and print result. Write class that will use these methods.
•	Write class with method that will take final integer and assign to it the square of this integer
and print result. What will you get? Explain result.
 */
public class Lab5 {
    public static void main(String[] args) {
        System.out.println(calcSquare(1, true));
        System.out.println(calcSquare(2));
        System.out.println(calcSquare(2, 3));

        testAssignFinal(5);
    }

    public static double calcSquare(double radius, boolean isCircle) {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public static double calcSquare(double side1, double side2) {
        return side1 * side2;
    }

    public static double calcSquare(double side) {
        return Math.pow(side, 2.0);
    }

    public static void testAssignFinal(final int testee) {
        //testee *= testee; cannot assign final
        System.out.println(testee);
    }
}
