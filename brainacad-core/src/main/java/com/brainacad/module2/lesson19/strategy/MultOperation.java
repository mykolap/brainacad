package com.brainacad.module2.lesson19.strategy;

/**
 * Created by Admin on 12/11/2016.
 */
class MultOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
