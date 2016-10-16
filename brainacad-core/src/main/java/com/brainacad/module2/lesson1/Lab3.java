package com.brainacad.module2.lesson1;

/**
 * Created by Alex on 16.10.2016.
 */
public class Lab3 {
    private int speed;

    public Lab3() {
        this(60);
    }

    public Lab3(int speed) {
        this.speed = speed;
        System.out.println("int called");
    }

    public Lab3(boolean reactive) {
        this();
        if (reactive) {
            Client.increaseSpeed(this);
        }
    }

    public Lab3(long speed) {
        this.speed = (int)speed;
        System.out.println("long called");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return (int)speed;
    }
    public long getReactiveSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Lab3 lab3 = new Lab3();

        int a = 80;
        short b = 80;
        Lab3 lab31 = new Lab3(a);
        //lab31.getAbc(a);
        Lab3 lab32 = new Lab3(80l);

        Lab3 lab33 = lab31;

        Client.increaseSpeed(lab31);

        Lab3 reactive = new Lab3(true);
        System.out.println(reactive.getSpeed());
        Lab3 nonReactive = new Lab3(false);
        System.out.println(nonReactive.getSpeed());
    }

    private void getAbc(short a) {

    }
}
