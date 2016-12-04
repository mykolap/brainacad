package com.brainacad.module2.lesson17;

public class DiningHall {
    private int pizzaNum;
    private int studentID = 1;

    public void makePizza() {
        pizzaNum++;
    }

    public void servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "Served ";
            pizzaNum--;
        } else {
            result = "Starved ";
        }
        System.out.println(result + studentID);
        studentID++;
    }

}
