package com.brainacad.module2.lesson3;

/*
Add to class Window overload constructors, which will initialize class’ fields,
depend from what data we will put there:
MyWindow(width, height),
MyWindow(width, height, numberOfGlass).
Finally class MyWindow must have four constructors)
 */
public class Lab3 {
    public static void main(String[] args) {
        MyWindow myWindow1 = new MyWindow(200, 300);
        System.out.println(myWindow1);
        MyWindow myWindow2 = new MyWindow(200, 300, 2);
        System.out.println(myWindow2);
        MyWindow myWindow3 = new MyWindow(200, 300, 2, "red");
        System.out.println(myWindow3);
    }

}
