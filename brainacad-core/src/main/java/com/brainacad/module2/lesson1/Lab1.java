package com.brainacad.module2.lesson1;

import java.util.Arrays;

/**
 * Created by Alex on 16.10.2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 10};
        int[] b = new int[10];

        System.arraycopy(a, 1, b, 5, 2);

        System.out.println(Arrays.toString(b));

        b = Arrays.copyOf(a, 3);

        byte i = 127;
        System.out.println(Integer.toBinaryString(i));
        int bbb = i + 1;
        System.out.println(Integer.toBinaryString(bbb));

        System.out.println(Integer.toBinaryString(-128));
        System.out.println(Integer.toBinaryString(-1));

    }


}
