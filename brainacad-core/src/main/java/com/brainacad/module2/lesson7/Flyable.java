package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 12.11.2016.
 */
public interface Flyable {
    public static final int a = 0;
    public abstract void fly();

    default double getPI() {
        return 3.14;
    }

    static double getE() {
        return 2;
    }

    enum Numbers {
        ONE,
        TWO,
        THREE
    }
}
