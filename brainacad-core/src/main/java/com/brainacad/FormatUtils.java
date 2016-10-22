package com.brainacad;

public class FormatUtils {

    public static String getFormattedNumber(int number, int width) {
        return getFormattedColumn(String.valueOf(number), width);
    }

    public static String getFormattedColumn(String value, int width) {
        if (value.length() < width) {
            return getFormattedColumn(" " + value, width);
        } else {
            return value;
        }
    }

}
