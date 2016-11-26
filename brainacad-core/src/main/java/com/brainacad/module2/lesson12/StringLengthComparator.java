package com.brainacad.module2.lesson12;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Alex on 20.11.2016.
 */
public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
    }

}
