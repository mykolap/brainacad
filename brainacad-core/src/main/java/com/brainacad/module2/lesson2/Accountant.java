package com.brainacad.module2.lesson2;

public class Accountant {
    void doJob() {
        Employee employee = new Employee();
        employee.calcSalary("Ivan", 100, 200, 300);

        Employee employee2 = new Employee();
        employee.calcSalary("Petro", 1000, 2000, 3000);
    }
}
