package home;

/**
 * Created by Alex on 19.11.2016.
 */
public abstract class Shape {

    public abstract double calcSquare();

    public Shape(int a) {
    }

    public Shape() {
        System.out.println("default super called");
    }
}
