package com.brainacad.module2.lesson3;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = 1;
        this.height = 1;
        this.numberOfGlass = 1;
        this.color = "white";
        this.isOpen = false;
    }

    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public void printFields() {
        System.out.println(toString());
    }
}
