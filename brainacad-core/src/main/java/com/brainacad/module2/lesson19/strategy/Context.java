package com.brainacad.module2.lesson19.strategy;

/**
 * Created by Alex on 12/11/2016.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
