package com.brainacad.module2.lesson19.strategy;

class AddOperation implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

