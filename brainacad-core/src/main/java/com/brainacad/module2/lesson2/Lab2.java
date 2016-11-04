package com.brainacad.module2.lesson2;

import java.util.Arrays;

/*
 Create class Matrix with 2D array (int, size 2x2) field and methods:
 addition and multiplication of matrices;
 */
public class Lab2 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
        Matrix matrix2 = new Matrix(new int[][]{{2, 3}, {4, 5}});
        Matrix matrix3 = new Matrix(new int[][]{{3, 4}, {5, 6}});

        System.out.println(Arrays.deepToString(matrix1.getArray2d()));
        matrix1.add(matrix2);
        System.out.println(Arrays.deepToString(matrix1.getArray2d()));

        System.out.println(Arrays.deepToString(matrix2.getArray2d()));
        matrix2.multiply(matrix3);
        System.out.println(Arrays.deepToString(matrix2.getArray2d()));
    }
}
