package com.brainacad.module2.lesson7;

/**
 * Created by Alex on 12.11.2016.
 */
public interface BirdInterface extends Flyable, Walkable {
    String WHO = "bird";
    void eat();
}
