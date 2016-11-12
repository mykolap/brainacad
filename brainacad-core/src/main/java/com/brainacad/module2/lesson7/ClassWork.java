package com.brainacad.module2.lesson7;

import java.util.Arrays;

/**
 * Created by Alex on 12.11.2016.
 */
public class ClassWork {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird(5, 30);
        birds[1] = new Bird(2, 20);
        birds[2] = new Bird(8, 10);

        System.out.println(Arrays.toString(birds));

        Arrays.sort(birds);

        System.out.println(Arrays.toString(birds));

        Arrays.sort(birds, new BirdSpeedComparator());

        System.out.println(Arrays.toString(birds));
    }
}
