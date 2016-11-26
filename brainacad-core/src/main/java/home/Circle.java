package home;

/**
 * Created by Alex on 19.11.2016.
 */
public class Circle extends Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public double calcSquare() {
        return 5;
    }

    @Override
    public Circle getSomeObj() {
        return new Circle("red");
    }

}
