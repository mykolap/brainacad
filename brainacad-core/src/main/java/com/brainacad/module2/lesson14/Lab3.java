package com.brainacad.module2.lesson14;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 Open project called  TestGenerics2 (from 2-14-2 lab).
 Rewrite a class MyTestMethod to add new static method “calcSum” (with two parameters: an array T[] and variable maxval of type T) that calc sum of the number of elements in an array T[] that are greater than a specified value maxval.
 Add to method main() code that creates two array, first – array of Integer type and second – array of Double type. Fill these arrays with some random values.
 Add code to counts the total sum of elements in each of arrays  that are greater than a specified element by invoking calcSum static method.
 Execute the program.
 The program output must be like next example:
 Array values: [1,2,3,4,5,6,7,8,9]
 Sum of elements that are greater than 3:
 39
 Array values: [1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9]
 Sum of elements that are greater than 3:
 46.2
 */
public class Lab3 {

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Number calcInt = (int) calcSum(integers, 3);
        System.out.println(calcInt);

        Double[] doubles = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        Number calcDouble = calcSum(doubles, 3.0);
        System.out.println(calcDouble);
    }

    public static <T extends Number & Comparable<T>> Number calcSum(T[] arr, T elem) {
        Number number = 0;
        for (T element : arr) {
            if (element.compareTo(elem) > 0) {
                number = addNumbers(number, element);
            }
        }
        return number;
    }

    public static Number addNumbers(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            Double doubleResult = a.doubleValue() + b.doubleValue();
            return new BigDecimal(doubleResult.toString()).setScale(2, RoundingMode.HALF_UP).doubleValue();
        } else if (a instanceof Float || b instanceof Float) {
            return a.floatValue() + b.floatValue();
        } else if (a instanceof Long || b instanceof Long) {
            return a.longValue() + b.longValue();
        } else {
            return a.intValue() + b.intValue();
        }
    }
}
