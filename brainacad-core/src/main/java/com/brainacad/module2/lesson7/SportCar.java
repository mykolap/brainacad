package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 06.11.2016.
 */
public class SportCar extends Car {
    public int superspeed = speed;
    {
//        engine = "sport eng";
    }

    public SportCar() {
    }

    public SportCar(int speed, int superspeed) {
        super();
        this.superspeed = superspeed;
    }

    @Override
    public String getName() {
        return "Sport car";
    }

    public static void main(String[] args) {
        Car car = new SportCar();
        System.out.println(car.getName());
//        System.out.println(car.engine);
        Car car1 = new Car();
//        System.out.println(car1.engine);
        Object car2 = new SportCar();
        System.out.println(car2.getClass());
    }

    @Override
    public SportCar clone() throws CloneNotSupportedException {
        return (SportCar) super.clone();
    }
}
