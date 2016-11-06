package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 06.11.2016.
 */
public class Car {
    public int speed;

    public long aaa;
    public float bbb;

    public Car() {
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return "Car";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (speed != car.speed) return false;
        if (aaa != car.aaa) return false;
        return Float.compare(car.bbb, bbb) == 0;
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result +
                (int) (aaa ^ (aaa >>> 32));
        result = 31 * result +
                (bbb != 0.0f ? Float.floatToIntBits(bbb) : 0);
        return result;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.speed = 10;

        Car car2 = new Car();
        car2.speed = 20;

        System.out.println(car1.equals(car2));
        System.out.println("" + car1.toString());
    }
}

