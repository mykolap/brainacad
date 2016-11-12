package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 12.11.2016.
 */
public class Lab3 {
    public static void main(String[] args) {
        Device device = new Device();
        device.setManufacturer("Samsung");
        device.setPrice(100_500);
        device.setSerialNumber("123");

        Device device2 = new Device();
        device2.setManufacturer("Samsung");
        device2.setPrice(100_500);
        device2.setSerialNumber("123");

        System.out.println(device.equals(device2));
        device2.setPrice(50);
        System.out.println(device.equals(device2));
    }
}
