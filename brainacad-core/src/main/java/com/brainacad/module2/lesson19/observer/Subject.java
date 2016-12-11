package com.brainacad.module2.lesson19.observer;

interface Subject {
    //methods to register and unregister observers
    void register(Observer obj);

    void unregister(Observer obj);

    //method to notify observers of change
    void notifyObservers();
    //method to get updates from subject
}

