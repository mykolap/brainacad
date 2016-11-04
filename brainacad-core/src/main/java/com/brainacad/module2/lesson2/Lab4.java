package com.brainacad.module2.lesson2;

/*
Create class Person with fields firstName(String),
lastName(String), age(int), gender(String), phoneNumber(int),
and  five overloaded methods that set this fields with different arguments list.
And create class that will be use instance of class Person and his methods.
 */
public class Lab4 {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        person.setFields("Petro");
        System.out.println(person);
        person.setFields("Petro", "Petrov");
        System.out.println(person);
        person.setFields("Petro", "Petrov", 20);
        System.out.println(person);
        person.setFields("Petro", "Petrov", 20, "male");
        System.out.println(person);
        person.setFields("Petro", "Petrov", 20, "male", 222_22_22);
        System.out.println(person);
    }

}
