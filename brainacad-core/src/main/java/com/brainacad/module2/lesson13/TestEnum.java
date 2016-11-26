package com.brainacad.module2.lesson13;

/**
 * Created by Admin on 11/26/2016.
 */
public enum TestEnum {

    JAN(1, "January", null),
    FEB(2, "February", JAN) {
        @Override
        public String toString() {
            return "some sheet";
        }
    };

    int ord;
    String fullName;

    public String getFullName() {
        return fullName;
    }

    private TestEnum(int ord, String intParam, TestEnum testEn) {
        this.ord = ord;
        fullName = intParam;
        System.out.println("new enum create with int param " + intParam);
    }


}
