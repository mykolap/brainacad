package com.brainacad.module2.lesson17;

import java.util.Map;

public class WriteThreadConcur extends Thread {
    private Map<Integer, String> concurHashMap;
    private int numbers;

    public WriteThreadConcur(Map<Integer, String> concurHashMap, int numbers) {
        this.concurHashMap = concurHashMap;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers; i++) {
            concurHashMap.put((i + 1), "string" + (i + 1));
            System.out.println(this.getName() + " " + (i + 1) + " write");
            try {
                sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
