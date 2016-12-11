package com.brainacad.module2.lesson19.singleton;

/**
 * Created by Alex on 12/11/2016.
 */
public class Work {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
