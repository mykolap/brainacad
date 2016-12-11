package com.brainacad.module2.lesson19.observer;

/**
 * Created by Alex on 12/11/2016.
 */
public class MyTopicSubscriber implements Observer {
    private String name;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + ":Consum. msg:" + msg);
    }
}
