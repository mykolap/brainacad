package com.brainacad.module2.lesson19.decorator;

/**
 * Created by Alex on 12/11/2016.
 */
public class Work {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle normal border");
        circle.draw();

        System.out.println("Red bordered circle");
        redCircle.draw();

        System.out.println("Red bordered rectangle");
        redRectangle.draw();
    }
}
