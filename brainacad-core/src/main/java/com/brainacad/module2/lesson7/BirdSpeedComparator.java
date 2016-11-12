package com.brainacad.module2.lesson7;

import java.util.Comparator;

/**
 * Created by Alex on 12.11.2016.
 */
public class BirdSpeedComparator implements Comparator<Bird> {
    @Override
    public int compare(Bird o1, Bird o2) {
        if (o1.getSpeed() < o2.getSpeed()) {
            return -1;
        }
        if (o1.getSpeed() > o2.getSpeed()) {
            return 1;
        }
        return 0;
    }
}
