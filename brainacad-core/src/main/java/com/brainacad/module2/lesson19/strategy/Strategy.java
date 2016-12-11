package com.brainacad.module2.lesson19.strategy;

/**
 * Created by Alex on 12/11/2016.
 */
public interface Strategy {
    int doOperation(int num1, int num2);
}

class AddOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class SubOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class MultOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
