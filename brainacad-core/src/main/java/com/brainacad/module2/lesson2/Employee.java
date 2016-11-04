package com.brainacad.module2.lesson2;

public class Employee {

    public void calcSalary(String name, double... salary) {
        double total = 0;
        for (double sum : salary) {
            total += sum;
        }
        System.out.println(name + ": " + total);
    }

}
