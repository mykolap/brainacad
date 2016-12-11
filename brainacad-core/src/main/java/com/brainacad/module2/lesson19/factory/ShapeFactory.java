package com.brainacad.module2.lesson19.factory;

import com.brainacad.module2.lesson19.decorator.Circle;
import com.brainacad.module2.lesson19.decorator.Rectangle;
import com.brainacad.module2.lesson19.decorator.Shape;

/**
 * Created by Alex on 12/11/2016.
 */
class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}