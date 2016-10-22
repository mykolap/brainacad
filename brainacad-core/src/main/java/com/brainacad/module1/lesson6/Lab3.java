package com.brainacad.module1.lesson6;

import java.util.Arrays;

/**
 Write a program, which creates square matrix like those in the figure below and prints them formatted to the console.
 The size of the matrix is 4 x 4:
 1	5	9	13
 2	6	10	14
 3	7	11	15
 4	8	12	16

 */
public class Lab3 {
    public static void main(String[] args) {
        Lab3 lab3 = new Lab3();
        System.out.println(Arrays.deepToString(lab3.getMartix(4)));
    }

    public int[][] getMartix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = i*matrixSize + j + 1;
            }
        }
        return matrix;
    }

}
