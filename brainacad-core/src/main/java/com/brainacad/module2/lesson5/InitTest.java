package com.brainacad.module2.lesson5;

import java.util.Random;

public class InitTest {

    private static int nextId;

    static {
        nextId = new Random().nextInt(1000) + 1;
    }

    private int id;

    {
        nextId++;
        id = nextId;
    }


    public int getId() {
        return id;
    }
}
