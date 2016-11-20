package com.brainacad.module2.lesson12;

/**
 * Created by Alex on 20.11.2016.
 */
public class Lab1 {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Dima", "111");
        myPhoneBook.addPhoneNumber("Raul", "222");
        myPhoneBook.addPhoneNumber("Mykola", "333");
        myPhoneBook.printPhoneBook();
    }
}
