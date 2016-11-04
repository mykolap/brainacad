package com.brainacad.module2.lesson3;

import java.util.Arrays;

/*
Create class “MyWindow” with fields (width (of double type), height (of double type), numberOfGlass(of int type), color(of  String type), isOpen(boolean)).
Create five instances of class MyWindow,  with different  fields values.
 */
public class Lab1 {
    public static void main(String[] args) {
        MyWindow[] myWindows = new MyWindow[5];
        for (int i = 0; i < myWindows.length; i++) {
            int usedForAutofill = i + 1;
            MyWindow myWindow = new MyWindow(usedForAutofill * 2, usedForAutofill * 4, usedForAutofill, "red", false);
            myWindows[i] = myWindow;
        }
        Arrays.stream(myWindows).forEach(System.out::println);
    }
}
