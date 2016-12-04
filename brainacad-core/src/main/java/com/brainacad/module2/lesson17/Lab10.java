package com.brainacad.module2.lesson17;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Lab10 {
    final static int NUMBERS_THREAD = 5;
    final static int NUMBERS_READ_WRITE = 6;

    public static void main(String[] args) throws InterruptedException {
        testWithHashMap();
        testWithConcurrentHashMap();
    }

    public static void testWithHashMap() throws InterruptedException {
        HashMap<Integer, String> hashMap = new HashMap<>();
        WriteThreadMap[] wtc = new WriteThreadMap[NUMBERS_THREAD];
        ReadThreadMap[] rtc = new ReadThreadMap[NUMBERS_THREAD];

        for (int i = 0; i < NUMBERS_THREAD; i++) {
            wtc[i] = new WriteThreadMap(hashMap, NUMBERS_READ_WRITE);
            rtc[i] = new ReadThreadMap(hashMap, NUMBERS_READ_WRITE);
        }

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < NUMBERS_THREAD; i++) {
            wtc[i].start();
        }

        for (int i = 0; i < NUMBERS_THREAD; i++) {
            rtc[i].start();
        }

        for (int i = 0; i < NUMBERS_THREAD; i++) {
            wtc[i].join();
            rtc[i].join();
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("\nResult with map + sync " + (timeEnd - timeStart) + " ms");
    }

    public static void testWithConcurrentHashMap() throws InterruptedException {
        ConcurrentHashMap<Integer, String> concurrentHashMap
                = new ConcurrentHashMap<>();
        WriteThreadConcur[] wtc = new WriteThreadConcur[NUMBERS_THREAD];
        ReadThreadConcur[] rtc = new ReadThreadConcur[NUMBERS_THREAD];

        for (int i = 0; i < NUMBERS_THREAD; i++) {
            wtc[i] = new WriteThreadConcur(concurrentHashMap,
                    NUMBERS_READ_WRITE);
            rtc[i] = new ReadThreadConcur(concurrentHashMap,
                    NUMBERS_READ_WRITE);
        }

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < NUMBERS_THREAD; i++) {
            wtc[i].start();
        }

        for (int i = 0; i < NUMBERS_THREAD; i++) {
            rtc[i].start();
        }

        for (int i = 0; i < NUMBERS_THREAD; i++) {
            wtc[i].join();
            rtc[i].join();
        }

        long timeEnd = System.currentTimeMillis();
        System.out.println("\nResult with concurrent " + (timeEnd - timeStart) + " ms");
    }

}
