package com.brainacad;

import org.junit.Assert;
import org.junit.Test;

public class FormatUtilsTest {
    @Test
    public void getFormattedNumber() throws Exception {
        Assert.assertEquals(" 9", FormatUtils.getFormattedNumber(9, 2));
        Assert.assertEquals(" 10", FormatUtils.getFormattedNumber(10, 3));
        Assert.assertEquals(" 99", FormatUtils.getFormattedNumber(99, 3));
        Assert.assertEquals(" 100", FormatUtils.getFormattedNumber(100, 4));
    }

}