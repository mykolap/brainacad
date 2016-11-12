package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 12.11.2016.
 */
public class Bird implements Comparable<Bird>, BirdInterface {

    private int age;
    private int speed;

    public Bird(int age, int speed) {
        this.age = age;
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void fly() {
        System.out.println("We fly");
    }

    @Override
    public double getPI() {
        return 5;
    }

    @Override
    public void walk() {
        System.out.println("We walk");
    }

    @Override
    public void eat() {
        System.out.println("We eat");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Bird bird) {
        if (this.age < bird.age) {
            return -1;
        }
        if (this.age > bird.age) {
            return 1;
        }
        return 0;
    }
}
