package com.brainacad.module2.lesson19.decorator;

/**
 * Created by Alex on 12/11/2016.
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
