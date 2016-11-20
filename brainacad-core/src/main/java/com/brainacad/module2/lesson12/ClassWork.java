package com.brainacad.module2.lesson12;

import java.util.Arrays;

/**
 * Created by Alex on 20.11.2016.
 */
public class ClassWork {
    public static void main(String[] args) {

        String[] arr = {"first", "second", "third"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        Arrays.stream(arr).forEach(System.out::println);

        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(arr));

    }

}
