package com.brainacad.module1.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class Lab3Test {

    @Test
    public void testGetNumberOfDigits() {
        Lab3 lab3 = new Lab3();
        Assert.assertEquals(1, lab3.getLengthOfDigit(9));
        Assert.assertEquals(2, lab3.getLengthOfDigit(10));
        Assert.assertEquals(2, lab3.getLengthOfDigit(99));
        Assert.assertEquals(3, lab3.getLengthOfDigit(100));
    }


}