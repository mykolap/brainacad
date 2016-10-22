package com.brainacad.module1.lesson6;

import com.brainacad.FormatUtils;

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
        int[][] martix = lab3.getMartix(4);
        System.out.println(Arrays.deepToString(martix));
        lab3.printMatrix(martix);
    }

    public int[][] getMartix(int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = i + j*matrixSize + 1;
            }
        }
        return matrix;
    }

    private void printMatrix(int[][] matrix) {
        int matrixSize = matrix.length;
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < matrixSize; j++) {
                String out = FormatUtils.getFormattedNumber(aMatrix[j], 4);
                if (j == matrixSize - 1) {
                    out += "\n";
                }
                System.out.print(out);
            }
        }
    }

}
