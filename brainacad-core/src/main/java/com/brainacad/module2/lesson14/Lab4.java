package com.brainacad.module2.lesson14;

import java.util.Arrays;

/**
 Create new project called  TestGenerics3.
 Add package “com.brainacad.oop.testgenerics3”.
 Create a generic class MyMixer<T> with field as Array of some type, provide constructor with one parameters.
 Add to MyMixer public “shuffle ()” method which shuffle elements of Array and return it;
 Create a class Main with a main( ) method.
 Add to method main() code that creates two Array of different types:
 First one is array of Integer with values {1,2,3,4,5,6,7,8,9}
 Second one is array of strings: {“one”,”two”, …}
 Create two objects of MyMixer type and using each of arrays, invoke shuffle () method and print result to console.
 Execute the program.
 Example of program output:
 [6,7,4,3,2,9,1,5,8]
 [nine,one,two,five,…,]
 */
public class Lab4 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] {1,2,3,4,5,6,7,8,9};
        String[] strings = new String[] {"one", "two", "three"};

        MyMixer<Integer> myMixer1 = new MyMixer<>(integers);
        MyMixer<String> myMixer2 = new MyMixer<>(strings);

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(strings));

//        Integer[] shuffledInts = myMixer1.shuffle();
        String[] shuffledStrings = myMixer2.shuffle();

        System.out.println(Arrays.toString(myMixer1.shuffle()));
        System.out.println(Arrays.toString(shuffledStrings));
    }
}
