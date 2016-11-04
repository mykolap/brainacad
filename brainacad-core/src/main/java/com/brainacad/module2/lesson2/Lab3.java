package com.brainacad.module2.lesson2;

/*
Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
This method should calc total salary of employee and print his name and total salary.
Write class Accountant that will be create Employee instance and use his method with
a different number of data.
 */
public class Lab3 {

    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.doJob();
    }

}
