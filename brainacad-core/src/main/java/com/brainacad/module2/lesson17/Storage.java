package com.brainacad.module2.lesson17;

public class Storage {
    private int value = 0;
    private boolean flag;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // version 2
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
