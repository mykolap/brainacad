package com.brainacad.module2.lesson16;

public class Lab3 {
    public static void main(String[] args) {
        foo(10, -10);
        foo(1, 2, 3);

        System.out.println("-------------------------");
        foo(55);
        foo(new int[]{9, 8, 7, 6, 5, 4});
        foo(new int[]{});

        System.out.println("-------------------------");
        foo();
        int[] arr = new int[10];
        foo(arr);
    }

    private static void foo(int a, int b) {
        System.out.println("a: " + a + ";\tb: " + b);
    }

    private static void foo(int... arr) {
        System.out.print("Array: ");
        for (int elem : arr)
            System.out.print(elem + " ");
        System.out.println();
    }
}
