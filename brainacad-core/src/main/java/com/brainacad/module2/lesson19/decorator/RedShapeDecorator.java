package com.brainacad.module2.lesson19.decorator;

/**
 * Created by Alex on 12/11/2016.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setRedBorder();
        decoratedShape.draw();
    }

    private void setRedBorder() {
        System.out.println("Red border set");
    }
}
