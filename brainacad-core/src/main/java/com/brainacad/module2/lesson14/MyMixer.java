package com.brainacad.module2.lesson14;

import java.util.Random;

/**
 * Created by Admin on 11/27/2016.
 */
public class MyMixer<T> {
    T[] myArr;

    public MyMixer(T[] myArr) {
        this.myArr = myArr;
    }

    public T[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < myArr.length; i++) {
            int newPosition = random.nextInt(myArr.length - 1);
            T newPosElement = myArr[newPosition];
            myArr[newPosition] = myArr[i];
            myArr[i] = newPosElement;
        }
        return myArr;
    }
}
