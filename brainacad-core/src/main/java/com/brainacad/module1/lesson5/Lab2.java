package com.brainacad.module1.lesson5;

import java.util.Scanner;

public class Lab2 {

    /*
    Write a program which prompts user for the number "X", reads it from the keyboard, and saves it in an int variable called "x".
    Then prints "One", "Two",... , "Nine" if the int variable "x" is 1, 2,... , 9 and "Other" if “x” >9, respectively.
    Use (a) a "nested-if" statement;
    (b) a "switch-case" statement.
    The output shall look like (user input – in green):
    -Enter number x: 1			-Enter number x: 12
    -One					- Other
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = scanner.nextInt();
        Lab2 lab2 = new Lab2();
        String xAsString = lab2.getNumberAsStringNestedIf(x);
        System.out.println(xAsString);
        System.out.print("Enter number y: ");
        int y = scanner.nextInt();
        String yAsString = lab2.getNumberAsStringNestedIf(y);
        System.out.println(yAsString);
    }

    private String getNumberAsStringSwitch(int x) {
        String outValue;
        switch (x) {
            case 1:
                outValue = "One";
                break;
            case 2:
                outValue = "Two";
                break;
            case 3:
                outValue = "Three";
                break;
            case 4:
                outValue = "Four";
                break;
            case 5:
                outValue = "Five";
                break;
            case 6:
                outValue = "Six";
                break;
            case 7:
                outValue = "Seven";
                break;
            case 8:
                outValue = "Eight";
                break;
            case 9:
                outValue = "Nine";
                break;
            default:
                outValue = "Other";
        }
        return outValue;
    }

    private String getNumberAsStringNestedIf(int x) {
        String outValue;
        if (x == 1) {
            outValue = "One";
        } else if (x == 2) {
                outValue = "Two";
        } else if (x == 3) {
                outValue = "Three";
        } else if (x == 4) {
            outValue = "Four";
        } else if (x == 5) {
            outValue = "Five";
        } else if (x == 6) {
            outValue = "Six";
        } else if (x == 7) {
            outValue = "Seven";
        } else if (x == 8) {
            outValue = "Eight";
        } else if (x == 9) {
            outValue = "Nine";
        } else {
            outValue = "Other";
        }
        return outValue;
    }

}
