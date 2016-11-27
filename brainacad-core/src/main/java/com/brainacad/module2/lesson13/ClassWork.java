package com.brainacad.module2.lesson13;

import com.brainacad.module2.lesson14.Lab2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by Admin on 11/26/2016.
 */
public class ClassWork {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Fruits.values()));
//        System.out.println(Fruits.APPLE);
//        System.out.println(Fruits.GRAPE);

        MyBox<Integer> myVar;

        Consumer<Lab2> consLab = new Consumer<Lab2>() {
            @Override
            public void accept(Lab2 lab2) {

            }
        };

        IntConsumer soutIntAsChar = new IntConsumer() {
            @Override
            public void accept(int intChar) {
                System.out.print((char) intChar);
            }
        };

        IntConsumer soutIntAsChar2 = new IntConsumer() {
            @Override
            public void accept(int intChar) {
                System.out.print((char) intChar);
            }
        };

        "bbcccdaa".chars().distinct().forEach(soutIntAsChar);
        System.out.println();
//        String result = "bbcccdaa".codePoints().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
//        System.out.println(result);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
