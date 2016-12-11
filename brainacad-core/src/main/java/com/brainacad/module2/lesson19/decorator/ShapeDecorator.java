package com.brainacad.module2.lesson19.decorator;

public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void setColor(String color) {
        decoratedShape.setColor(color);
    }

    @Override
    public void draw() {
    decoratedShape.draw();
    }
}
