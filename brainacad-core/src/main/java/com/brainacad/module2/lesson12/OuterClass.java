package com.brainacad.module2.lesson12;

/**
 * Created by Alex on 20.11.2016.
 */
public class OuterClass {
    public int a = 5;
    static int d;
    class InnerClass {
        protected int a = 10;
        void doPrint() {
            int a = 20;
            System.out.println(a); //20
            System.out.println(this.a); // 10
            System.out.println(OuterClass.this.a); // 5
        }
    }
    static class StaticNestedClass {
        int b = d + 5;
    }

    public static void main(String[] args) {
        String s = "one";
        switch (s) {
            case "one":
                System.out.println(s);
                break;
            case "two":
                System.out.println(s);
                break;
                default:
                    System.out.println(s);
        }
    }
}
