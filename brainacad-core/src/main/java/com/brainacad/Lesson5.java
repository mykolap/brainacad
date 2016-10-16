package com.brainacad;

/**
 * Created by Admin on 09/10/2016.
 */
public class Lesson5 {
    public static void main(String[] args) {
        Lesson5 lesson5 = new Lesson5();
        MonthDetector monthDetector1 = new MonthDetector(1);
        System.out.println(monthDetector1.getString());
        System.out.println(monthDetector1.getMonthNumber());
        System.out.println(new MonthDetector(2).getString());
        System.out.println(new MonthDetector(5).getString());
        System.out.println(new MonthDetector(10).getString());

        System.out.println("test");
    }

}
