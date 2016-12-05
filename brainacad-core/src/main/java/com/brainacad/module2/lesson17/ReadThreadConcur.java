package com.brainacad.module2.lesson17;

import java.util.Map;

public class ReadThreadConcur extends Thread {
    private Map<Integer, String> concurHashMap;
    private int numbers;

    public ReadThreadConcur(Map<Integer, String> concurHashMap, int numbers) {
        this.concurHashMap = concurHashMap;
        this.numbers = numbers;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbers; i++) {
            String str = concurHashMap.get(i + 1);
            System.out.println(this.getName() + " " + (i + 1) + " read = " + str);
            try {
                sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}
