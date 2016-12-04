package com.brainacad.module2.lesson16;

public class Lab4 {
    public static void main(String[] args) {
        foo(null);
        Puppy puppy = null;
        foo(puppy);

        System.out.println("------------");
        Dog dog = null;
        foo(dog);
    }

    private static void foo(Animal animal) {
        System.out.println("Animal");
    }

    private static void foo(Dog dog) {
        System.out.println("Dog");
    }

    private static void foo(Puppy puppy) {
        System.out.println("Puppy");
    }
}
