package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;

/*
 Create a project with structure:
 package example.applepack
 package com.brainacad.carpack
 package example.testpack
 Create two classes:
 1) Class of Apple (in the package example.applepack)
 with methods getMass, setMass, which provide access
 to the field “weight” as double type.
 2) Class of Car (in the package com.brainacad.carpack)
 with methods getMass, setMass, which provide access
 to the field “weight” as double type.

 Create class Main (in the package example.testpack)
 with method main(), which creates an instance of Apple and Car
 (use import statement ),  then prints its value of weight
  for each instance;
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setWeight(5);

        Apple apple = new Apple();
        apple.setWeight(10);

        System.out.println(car.getWeight());
        System.out.println(apple.getWeight());
    }
}
