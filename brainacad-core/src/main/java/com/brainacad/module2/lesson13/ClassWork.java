package com.brainacad.module2.lesson13;

/**
 * Created by Admin on 11/26/2016.
 */
public class ClassWork {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Fruits.values()));
        System.out.println(Fruits.APPLE);
        System.out.println(Fruits.GRAPE);

        MyBox<Integer> myVar;

        "bbcccdaa".chars().distinct().forEach(intChar -> System.out.print((char) intChar));
        System.out.println();
        String result = "bbcccdaa".codePoints().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(result);
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
