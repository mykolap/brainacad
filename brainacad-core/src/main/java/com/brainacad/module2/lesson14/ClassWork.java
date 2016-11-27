package com.brainacad.module2.lesson14;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Admin on 11/27/2016.
 */
public class ClassWork {
    public static void main(String[] args) {
        /*
        List<Integer> collection = new ArrayList<>();
        collection.add(5);
        collection.add(3);
        collection.add(12);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 4;
//            }
//        };

        Function<Integer, Double> integerDoubleFunction = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer.doubleValue();
            }
        };

        List<Integer> collectionGT4 = collection.stream().filter(myVar -> myVar > 4).collect(Collectors.toList());

        List<Double> collectionDouble = collection.stream().map(integerDoubleFunction).collect(Collectors.toList());

        List<Double> collectionDouble2 = collection.stream().map(Integer::doubleValue).collect(Collectors.toList());

        System.out.println(collection);
        System.out.println(collectionGT4);
        System.out.println(collectionDouble);
*/

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(new LinkedList<>());
        lists.get(0).add(5);
        lists.get(0).add(2);

        lists.add(new ArrayList<>());
        lists.get(1).add(3);

        lists.forEach(line -> {
            System.out.println("Start line");
            line.forEach(element -> System.out.print(element + " "));
            System.out.println("\nEnd line");
        });

        for (int i = 0; i < lists.size(); i++) {
            List<Integer> line = lists.get(i);
            System.out.println("Start line");
            for (int j = 0; j < line.size(); j++) {
                Integer element = line.get(j);
                System.out.print(element + " ");
            }
            System.out.println("\nEnd line");
        }

        for (List<Integer> line : lists) {
            System.out.println("Start line");
            for (Integer element : line) {
                System.out.print(element + " ");
            }
            System.out.println("\nEnd line");
        }


        SortedSet<String> sortedSet = new TreeSet<>(Comparator.comparingInt(String::length));

        sortedSet.add("abba");
        sortedSet.add("edi");
        sortedSet.add("aaaaaaaaaaaa");

        sortedSet.forEach(System.out::println);

        List<String> strList = new ArrayList<>();
        strList.add("abba");
        strList.add("abba");
        strList.add("ccc");
        strList.add("ddd");

        Set<String> set = new HashSet<>(strList);
        System.out.println(set);

        set = strList.stream().filter(str -> !str.equals("ddd")).collect(Collectors.toSet());
        System.out.println(set);

        Collection<Integer> trueCollection = new ArrayList<>(20);
        trueCollection.add(5);
        trueCollection.add(6);
        trueCollection.add(2);
        trueCollection.add(3);
        System.out.println(trueCollection);
        System.out.println(trueCollection.size());
        trueCollection.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer myVar) {
                return myVar > 3;
            }
        });
        trueCollection.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer myVar) {
                System.out.println("current element - " + myVar);
            }
        });

        trueCollection = new LinkedList<>();
    }
}
