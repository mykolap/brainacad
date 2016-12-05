package com.brainacad.module2.lesson17;

import java.util.Map;

public class ReadThreadMap extends Thread {
    private Map<Integer, String> hashMap;
    private int numbers;

    public ReadThreadMap(Map<Integer, String> concurHashMap, int numbers) {
        this.hashMap = concurHashMap;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers; i++) {
            synchronized (hashMap) {
                String str = hashMap.get(i + 1);
                System.out.println(this.getName() + " " + (i + 1) + " read = " + str);
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
