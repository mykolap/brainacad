package com.brainacad.module1.lesson5;

import com.brainacad.FormatUtils;
import org.junit.Assert;
import org.junit.Test;

public class Lab3Test {

    @Test
    public void testGetPifagorTable() {
        String expected = "* |  1  2  3  4  5  6  7  8  9\n" +
                "------------------------------\n" +
                "1 |  1  2  3  4  5  6  7  8  9\n" +
                "2 |  2  4  6  8 10 12 14 16 18\n" +
                "3 |  3  6  9 12 15 18 21 24 27\n" +
                "4 |  4  8 12 16 20 24 28 32 36\n" +
                "5 |  5 10 15 20 25 30 35 40 45\n" +
                "6 |  6 12 18 24 30 36 42 48 54\n" +
                "7 |  7 14 21 28 35 42 49 56 63\n" +
                "8 |  8 16 24 32 40 48 56 64 72\n" +
                "9 |  9 18 27 36 45 54 63 72 81\n";
        Lab3 lab3_9 = new Lab3(9, 3);
        Assert.assertEquals(expected, lab3_9.getPifagorTable());

        expected = "* |  1  2  3\n" +
                "------------\n" +
                "1 |  1  2  3\n" +
                "2 |  2  4  6\n" +
                "3 |  3  6  9\n";
        Lab3 lab3_3 = new Lab3(3, 3);
        Assert.assertEquals(expected, lab3_3.getPifagorTable());

        expected = " * |   1   2   3   4   5   6   7   8   9  10  11  12\n" +
                "----------------------------------------------------\n" +
                " 1 |   1   2   3   4   5   6   7   8   9  10  11  12\n" +
                " 2 |   2   4   6   8  10  12  14  16  18  20  22  24\n" +
                " 3 |   3   6   9  12  15  18  21  24  27  30  33  36\n" +
                " 4 |   4   8  12  16  20  24  28  32  36  40  44  48\n" +
                " 5 |   5  10  15  20  25  30  35  40  45  50  55  60\n" +
                " 6 |   6  12  18  24  30  36  42  48  54  60  66  72\n" +
                " 7 |   7  14  21  28  35  42  49  56  63  70  77  84\n" +
                " 8 |   8  16  24  32  40  48  56  64  72  80  88  96\n" +
                " 9 |   9  18  27  36  45  54  63  72  81  90  99 108\n" +
                "10 |  10  20  30  40  50  60  70  80  90 100 110 120\n" +
                "11 |  11  22  33  44  55  66  77  88  99 110 121 132\n" +
                "12 |  12  24  36  48  60  72  84  96 108 120 132 144\n";
        Lab3 lab3_12 = new Lab3(12, 4);
        Assert.assertEquals(expected, lab3_12.getPifagorTable());
    }

    @Test
    public void testGetFormattedNumber() {
    }

}