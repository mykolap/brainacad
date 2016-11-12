package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 12.11.2016.
 */
public class Lab2 {
    public static void main(String[] args) {
        Device device = new Device();
        device.setManufacturer("Samsung");
        device.setPrice(100_500);
        device.setSerialNumber("123");

        Monitor device2 = new Monitor();
        device2.setManufacturer("Samsung");
        device2.setPrice(100_500);
        device2.setSerialNumber("123");
        device2.setResolutionX(1920);
        device2.setResolutionY(1200);

        System.out.println(device);
        System.out.println(device2);

    }
}
