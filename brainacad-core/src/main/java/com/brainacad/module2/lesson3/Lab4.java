package com.brainacad.module2.lesson3;

/*
Change code in two overloaded constructors to invoke first constructor using “this” keyword.
 */
public class Lab4 {
    public static void main(String[] args) {
        MyWindow myWindow1 = new MyWindow(200, 300);
        System.out.println(myWindow1);
        MyWindow myWindow2 = new MyWindow(200, 300, 2);
        System.out.println(myWindow2);
        MyWindow myWindow3 = new MyWindow(200, 300, 2, "red");
        System.out.println(myWindow3);
    }

}
