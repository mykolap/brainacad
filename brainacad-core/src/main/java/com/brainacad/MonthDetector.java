package com.brainacad;

/**
 * Created by Admin on 09/10/2016.
 */
public class MonthDetector {
    final private int monthNumber;

    public MonthDetector(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getString() {
        String returnMonth;
        switch (monthNumber) {
            case 1 : returnMonth = "January";
                break;
            case 2 : returnMonth = "Fabruary";
                break;
            case 5 : returnMonth = "May";
                break;
            default: returnMonth = "Unknown";
        }
        return returnMonth;
    }
}
