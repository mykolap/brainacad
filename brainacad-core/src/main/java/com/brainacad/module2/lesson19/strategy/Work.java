package com.brainacad.module2.lesson19.strategy;

/**
 * Created by Alex on 12/11/2016.
 */
public class Work {
    public static void main(String[] args) {
        Context context = new Context();

        int num1 = 33;
        int num2 = 22;

        context.setStrategy(new AddOperation());
        System.out.println("33 + 22 = " + context.executeStrategy(num1, num2));

        context.setStrategy(new SubOperation());
        System.out.println("33 - 22 = " + context.executeStrategy(num1, num2));

        context.setStrategy(new MultOperation());
        System.out.println("33 * 22 = " + context.executeStrategy(num1, num2));

        context.setStrategy((num11, num21) -> num11 / num21);
        System.out.println("33 / 22 = " + context.executeStrategy(num1, num2));
    }
}
