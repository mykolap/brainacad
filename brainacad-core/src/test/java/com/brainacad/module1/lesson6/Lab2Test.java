package com.brainacad.module1.lesson6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2Test {

    @Test
    public void testMedian() throws Exception {
        Lab2 lab2 = new Lab2();

        double expectedResult = 7;
        double result = lab2.median(new int[] {7,1,2,1_000,1_000_000});
        Assert.assertEquals(expectedResult, result, 0.01);

        expectedResult = 6.5;
        result = lab2.median(new int[] {7,1,6,2,1_000,1_000_000});
        Assert.assertEquals(expectedResult, result, 0.01);
    }

}