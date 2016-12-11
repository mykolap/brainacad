package com.brainacad.module2.lesson19.decorator;

/**
 * Created by Alex on 12/11/2016.
 */
public class Circle implements Shape {
    private String color = "white";
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle draw, color " + color);
    }
}
