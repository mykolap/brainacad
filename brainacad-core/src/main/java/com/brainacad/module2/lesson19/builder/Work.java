package com.brainacad.module2.lesson19.builder;

/**
 * Created by Alex on 12/11/2016.
 */
public class Work {
    public static void main(String[] args) {
        User user1 = new UserBuilder("Alex", "Ivanov")
                .age(30)
                .phone("1234567")
                .address("My address 1234")
                .build();

        System.out.println(user1);

        User user2 = new UserBuilder("Vova", "Petrov")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new UserBuilder("Igor", "Sidorov")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer
                .append(true)
                .append('a')
                .append("str")
                .append(55);
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(i);
        }
        String str = stringBuffer.append(5).append(8).toString();
        System.out.println(str);
        //String str = stringBuffer.toString();
    }
}
