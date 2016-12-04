package com.brainacad.module2.lesson17;

import java.util.HashMap;

public class WriteThreadMap extends Thread {
    private HashMap<Integer, String> hashMap;
    private int numbers;

    public WriteThreadMap(HashMap<Integer, String> concurHashMap, int numbers) {
        this.hashMap = concurHashMap;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers; i++) {
            synchronized (hashMap) {
                hashMap.put((i + 1), "string" + (i + 1));
                System.out.println(this.getName() + " " + (i + 1) + " write");
                try {
                    sleep(10);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
