package com.brainacad.module2.lesson1;

/*
Write a program to create array of Computer objects (5 pcs.)
Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array (using loop).
 */
public class Lab3 {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = ComputerUtils.createIndexBasedComputer(i);
        }
    }

}
