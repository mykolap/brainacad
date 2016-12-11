package com.brainacad.module2.lesson19.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 12/11/2016.
 */
public class MyTopic implements Subject {
    List<Observer> observers;
    private String message;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update(this.message);
        }
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to topic: " + msg);
        this.message = msg;
        notifyObservers();
    }
}
