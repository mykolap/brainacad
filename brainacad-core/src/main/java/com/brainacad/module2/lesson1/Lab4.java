package com.brainacad.module2.lesson1;

import java.util.Arrays;

/*
Write a program, that iterate through array of Computer objects and increases by 10 percent field price.
 */
public class Lab4 {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = ComputerUtils.createIndexBasedComputer(i);
        }

        printComputers("Before increase:", computers);

        for (Computer computer : computers) {
            increasePrice(computer, 10);
        }

        printComputers("After increase:", computers);

    }

    public static void printComputers(String label, Computer[] computers) {
        System.out.println(label);
        Arrays.stream(computers).forEach(System.out::println);
    }

    public static void increasePrice(Computer computer, float percent) {
        computer.setPrice(computer.getPrice() * (1 + percent / 100));
    }

}
