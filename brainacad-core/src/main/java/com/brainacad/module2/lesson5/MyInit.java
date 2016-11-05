package com.brainacad.module2.lesson5;

import java.util.Random;

public class MyInit {
    private Integer[] arr;
    {
        arr = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99) + 1;
        }
    }

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }
}
