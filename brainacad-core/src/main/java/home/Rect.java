package home;

/**
 * Created by Alex on 19.11.2016.
 */
public class Rect extends Shape {
    private String color;

    public Rect(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public double calcSquare() {
        return 4;
    }
}
