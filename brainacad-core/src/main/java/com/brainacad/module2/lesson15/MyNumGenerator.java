package com.brainacad.module2.lesson15;

import java.util.*;

public class MyNumGenerator {
    // lab 2_15_4
    private int numOfElm,
            maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate() {
        Random random = new Random();
        List list = new ArrayList(numOfElm);
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    // lab 2_15_5
    public Set generateDistinct() {
        if (numOfElm > maxNumb) {
            System.out.println("Impossible to create a set " +
                    "(required number more than the number of possible values)");
            return null;
        }
        Random random = new Random();
        Set set = new HashSet(numOfElm);
        for (int i = 0; i < numOfElm; i++) {
            if (!set.add(random.nextInt(maxNumb))) {
                i--;
            }
        }
        return set;
    }
}
