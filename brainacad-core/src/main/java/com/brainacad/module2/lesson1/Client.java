package com.brainacad.module2.lesson1;

/**
 * Created by Alex on 16.10.2016.
 */
public class Client {
    public static void main(String[] args) {
        Lab3 lab3 = new Lab3();
        int mySpeed = lab3.getSpeed();
//        int mySpeed = lab3.speed;
    }

    public static void increaseSpeed(Lab3 lab3) {
        lab3.setSpeed(lab3.getSpeed() * 2);
    }
}
