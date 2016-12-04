package com.brainacad.module2.lesson15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        final int NUMBER_OF_ITEMS_LIST = 10;
        List<String> linkedList = new LinkedList<>();

        fillOfLinkedList(linkedList, NUMBER_OF_ITEMS_LIST);

        Iterator<String> iterator1 = linkedList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }

    public static void fillOfLinkedList(List<String> stringList, int numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers; i++) {
            int position = random.nextInt(i + 1);
            stringList.add(position, "num_" + i);
        }
    }
}
