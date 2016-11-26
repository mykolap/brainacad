package com.brainacad.module2.lesson13;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created by Admin on 11/26/2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        MyDayOfWeek[] arr = MyDayOfWeek.values();

        Arrays.stream(arr)
                .filter(myDayOfWeek -> myDayOfWeek != MyDayOfWeek.MONDAY)
                .forEach(Lab1::print);

//        Stream.of("My string").forEach(System.out::println);
//        Object object = new Lab1().getObject();
//
//        Integer myInt = new Lab1().<Integer>getObject();
        Integer i = 5;
        Object someVar = i;

        System.out.println(someVar instanceof Number);
        System.out.println(someVar instanceof Integer);
        System.out.println(someVar instanceof Object);
        System.out.println(someVar instanceof String);

    }

    static void print(MyDayOfWeek myDayOfWeek) {
        System.out.println(myDayOfWeek);
    }


}
