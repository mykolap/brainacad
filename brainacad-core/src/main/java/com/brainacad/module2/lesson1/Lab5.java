package com.brainacad.module2.lesson1;

import java.util.Arrays;

/*
Add to class Computer method void view (){} that prints all fields of object in line.
Print all info (fields) of all objects in console.
 */
public class Lab5 {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = ComputerUtils.createIndexBasedComputer(i);
        }

        Arrays.stream(computers).forEach(Computer::view);
    }

}
