package com.brainacad.module2.lesson19.builder;

/**
 * Created by Alex on 12/11/2016.
 */
public class Work {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Alex", "Ivanov")
                .age(30)
                .phone("1234567")
                .address("My address 1234")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Vova", "Petrov")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Igor", "Sidorov")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
