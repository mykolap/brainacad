package com.brainacad.module2.lesson15;

import java.util.Scanner;

/**
 Create new project called TestMap1. Add package “com.brainacad.oop.testmap1”.
 1) Create a class MyTranslator with private field dictionary of HashMap<String,String> type.
 Add method addNewWord(String en, String ru), which add to dictionary new word in two languages.
 2) Add a new method translate(String en) which take some string in English,
 and returns
 its translation in Russian as the value of the type String.
 3) Create a class Main with a main() method.
 Add to method main() code creates instance of MyTranslator.
 Add code to fill MyTranslator with few en-rus words pair by invoking
 addNewWord() method. For example: “сat”, “кот” “mouse”, “мышь” …
 4) Add code to read string from console and pass it into translate method.
 Print result to console. 5) Execute the program.
 The program output must be like next example: cat caught mouse кот поймал мышь
 */
public class Lab6 {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");
        myTranslator.addNewWord("caught", "поймал");

        System.out.println("Normal cat");
        "cat".chars().forEach(System.out::print);
        System.out.println();
        System.out.println("Cat from task");
        "сat".chars().forEach(System.out::print);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        translateText(text, myTranslator);
        System.out.println();
    }

    public static void fillDictionary(MyTranslator translator) {
        translator.addNewWord("Cat", "Кот");
        translator.addNewWord("mouse", "мышь");
        translator.addNewWord("caught", "поймал");
    }

    public static void translateText(String text, MyTranslator translator) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(translator.translate(words[i]) + " ");
        }
    }
}
