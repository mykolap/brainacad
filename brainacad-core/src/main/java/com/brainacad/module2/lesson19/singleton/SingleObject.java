package com.brainacad.module2.lesson19.singleton;

public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Get the only object available
    public static SingleObject getInstance() {
        if (instance == null) {
            synchronized(SingleObject.class) {
                if (instance == null) {
                    instance = new SingleObject();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World! " + toString());
    }
}