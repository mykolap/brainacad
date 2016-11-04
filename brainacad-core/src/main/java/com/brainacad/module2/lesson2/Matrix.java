package com.brainacad.module2.lesson2;

public class Matrix {
    private int[][] array2d;

    public Matrix(int[][] array2d) {
        this.array2d = array2d;
    }

    public int[][] getArray2d() {
        return array2d;
    }

    public void setArray2d(int[][] array2d) {
        this.array2d = array2d;
    }

    public void add(Matrix matrix) {
        for (int i = 0; i < matrix.getArray2d().length; i++) {
            int[] subarray = matrix.getArray2d()[i];
            for (int j = 0; j < subarray.length; j++) {
                array2d[i][j] += matrix.getArray2d()[i][j];
            }
        }
    }

    public void multiply(Matrix matrix) {
        for (int i = 0; i < matrix.getArray2d().length; i++) {
            int[] subarray = matrix.getArray2d()[i];
            for (int j = 0; j < subarray.length; j++) {
                array2d[i][j] *= matrix.getArray2d()[i][j];
            }
        }
    }

}
