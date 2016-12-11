package com.brainacad.module2.lesson19.factory;

import com.brainacad.module2.lesson19.decorator.Shape;

/**
 * Created by Alex on 12/11/2016.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
