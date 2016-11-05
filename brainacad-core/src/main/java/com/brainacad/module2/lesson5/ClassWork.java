package com.brainacad.module2.lesson5;

//import com.brainacad.module2.lesson4.*;

import java.util.Date;

import static java.lang.Math.*;

public class ClassWork {
    private static int a = 5;
    private static int c = doInit();
    private static int b = a * 3;
    private int d;



    private static final int MY;

    private static final int PI;

    static {
        MY = 5;
    }

    static {
        PI = 5;
    }

//private static void my() {
//    MY = 5;
//}
    private int numOfCars;

    {
        System.out.println("initializer 1");
        numOfCars++;
    }


    public ClassWork() {
        System.out.println("initializer 2");
        numOfCars += 2;
    }

    public ClassWork(int d) {
        this();
        System.out.println("initializer 3");
        numOfCars += 2;

    }

    public static void main(String[] args) {
        //new ClassWork();
        ClassWork classWork = new ClassWork(5);

        System.out.println(classWork.numOfCars);

        ClassWork classWork1 = new ClassWork();
        System.out.println(classWork1.numOfCars);

        char a = 'a';
        char b = 'b';
        char d = 'd';

        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((int)d);

        java.sql.Date dateSql = new java.sql.Date(100L);
        Date date = new Date();
        //java.util.Date;

        double sum = Math.PI * 2;
        System.out.println(sum);

        com.brainacad.module2.lesson4.MyPyramid myPyramid =
                new com.brainacad.module2.lesson4.MyPyramid();
//        MyCalc myCalc = null;
//        MyMath myMath = null;
//        Employee employee;
//        Calculation calculation;
//        GravityCalculator gravityCalculator;
    }

    private static int doInit() {
        return 5;
    }

    {
        System.out.println("initializer 4");
        numOfCars += 2;
    }

}
