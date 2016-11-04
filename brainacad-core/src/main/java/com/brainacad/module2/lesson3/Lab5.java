package com.brainacad.module2.lesson3;

import java.util.Arrays;

/*
Change code in two overloaded constructors to invoke first constructor using “this” keyword.
 */
public class Lab5 {
    public static void main(String[] args) {
        MyWindow[] myWindows = new MyWindow[3];

        MyWindow myWindow1 = new MyWindow(100, 200);
        myWindows[0] = myWindow1;

        MyWindow myWindow2 = new MyWindow(100, 200, 2);
        myWindows[1] = myWindow2;

        MyWindow myWindow3 = new MyWindow(100, 200, 2, "green");
        myWindows[2] = myWindow3;

        Arrays.stream(myWindows).forEach(MyWindow::printFields);
    }

}
