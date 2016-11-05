package com.brainacad.module2.lesson4;

public class MyCalc {
    public static double calcPi(int n) {
        double pi = 4.0;
        for (int i = 1; i <= n; i++) {
            double tmpPart = 4.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += tmpPart;
            } else {
                pi -= tmpPart;
            }
        }
        return pi;
    }
}
