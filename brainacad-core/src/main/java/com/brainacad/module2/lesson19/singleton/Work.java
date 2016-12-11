package com.brainacad.module2.lesson19.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Work {
    public static void main(String[] args) throws InterruptedException {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        ExecutorService poolOfSingletons = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 50; i++) {
            //Thread.sleep(2100);
            poolOfSingletons.submit(() -> {
                SingleObject object = SingleObject.getInstance();
                object.showMessage();
            });
        }
        Thread.sleep(5000);
        poolOfSingletons.shutdown();
    }
}
