package com.brainacad.module2.lesson15;

import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        final int NUMBER_OF_ITEMS_LIST = 10;
        List<String> list_1 = new ArrayList<>();
        List<String> list_2 = new LinkedList<>();

        fillOfList(list_1, NUMBER_OF_ITEMS_LIST);
        fillOfList(list_2, NUMBER_OF_ITEMS_LIST);

        System.out.print("The initial first collection: ");
        printElements(list_1);
        System.out.print("The initial second collection: ");
        printElements(list_2);

        System.out.println("Second  list combined with the first: ");
        insertInList(list_2, list_1);
        printElements(list_2);

        System.out.println("Second list after the insertion in the end of the first: ");
        insertInListWithEnd(list_2, list_1);
        printElements(list_2);
    }

    public static void fillOfList(List<String> list, int numbers) {
        for (int i = 0; i < numbers; i++) {
            list.add("num_" + i);
        }
    }

    public static void printElements(List<String> stringList) {
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next() + "   ");
        }
        System.out.println();
    }

    public static void insertInList(List<String> list_1, List<String> list_2) {
        Random random = new Random();
        Iterator<String> iterator = list_2.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            int pos = random.nextInt(list_1.size());
            ListIterator<String> listIterator = list_1.listIterator(pos);
            listIterator.add(str);
        }
    }

    public static void insertInListWithEnd(List<String> list_1, List<String> list_2) {
        ListIterator<String> iteratorArray = list_2.listIterator();
        ListIterator<String> iteratorLinked = list_1.listIterator(list_1.size());
        while (iteratorArray.hasNext()) {
            String str = iteratorArray.next();
            iteratorLinked.add(str + 1);
            iteratorLinked.previous();
            iteratorLinked.previous();
        }
    }
}
