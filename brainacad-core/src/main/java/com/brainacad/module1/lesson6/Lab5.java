package com.brainacad.module1.lesson6;

/**
 * Write a program, which finds in a given matrix the area of equal numbers. Here is one example with an area containing 7 elements with equal value of 1:
 * <p>
 * 1	1	1	3	4
 * 2	1	3	1	2
 * 2	2	3	4	1
 * 3	3	3	1	4
 * <p>
 * The program must print to console:
 * Line 1: [0-2]
 * Line 2: [1,3]
 * Line 3: [4]
 * Line 4: [3]
 */
public class Lab5 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 3, 4, 1, 1},
                {2, 1, 3, 1, 2, 4, 1},
                {2, 2, 1, 1, 1, 1, 5},
                {2, 2, 3, 4, 3, 4, 1},
                {3, 3, 3, 1, 1, 1, 4}
        };

        int elementToFind = 1;

        for (int i = 0; i < arr.length; i++) {
            int[] row = arr[i];
            if (row.length > 0) {
                String out = getSearchResult(row, i, elementToFind);
                System.out.println(out);
            }
        }
    }

    private static String getSearchResult(int[] row, int rowIndex, int elementToFind) {
        int lastFoundIndex = -1;
        boolean hasUnclosedInterval = false;
        String out = "Line " + rowIndex + ": ";
        for (int j = 0; j < row.length; j++) {
            if (row[j] == elementToFind) {
                if (lastFoundIndex == -1) {
                    out = out + "[" + j;
                } else {
                    if (j == lastFoundIndex + 1) {
                        hasUnclosedInterval = true;
                    } else {
                        out = out + "," + j;
                    }
                }
                lastFoundIndex = j;
            } else {
                if (hasUnclosedInterval) {
                    out += "-" + lastFoundIndex;
                    hasUnclosedInterval = false;
                }
            }
        }
        if (lastFoundIndex != -1) {
            if (hasUnclosedInterval) {
                out += "-" + lastFoundIndex;
            }
            out += "]";
        }
        return out;
    }
}
