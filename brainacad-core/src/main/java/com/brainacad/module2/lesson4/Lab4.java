package com.brainacad.module2.lesson4;

/*
Create Emploee class with fields firstName, lastName, occupation, telephone
and static field numberOfEmployees and getters/setters.
Also class must have constructor, which will initialize class fields end increment numberOfEmployees.
 */
public class Lab4 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Ivanov", "worker", 111);
        Employee employee2 = new Employee("Petro", "Petrov", "president", 222);

        System.out.println(Employee.getNumberOfEmployees());
    }
}
