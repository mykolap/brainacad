package com.brainacad.module2.lesson16;

/**
 Remind that student should apply his or her knowledge of: * how to use overload resolution;
 Execute following steps: * Student should create class Animal and extends from him create class Dog.
 * Student should create class Main which has two methods foo(Animal a) and foo(Dog d).
 * This methods print to console “Animal” and “Dog” respectively.
 * * Student should create and provide all necessary code in a method main() to show
 * how does overload resolution works when we put this reference(Animal a = new Dog();) to method (foo).
 */
public class Lab1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        foo(dog);
        Animal animal = dog;
        foo(animal);
    }

    static void foo(Animal a) {
        System.out.println("foo Animal");
    }

    static void foo(Dog d) {
        System.out.println("foo Dog");
    }
}
