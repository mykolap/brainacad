package com.brainacad.module2.lesson10;

/**
 * Created by Alex on 19.11.2016.
 */
public class Lab2 {
    public static void main(String[] args) {
        long result = compute(Byte.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println(result);
    }

    public static Long compute(Byte param1, Integer param2) {
        Long returnValue = param1.longValue() + param2.longValue();
        return returnValue;
    }
}
