package com.brainacad.module2.lesson2;

/**
 * Created by Alex on 22.10.2016.
 */
public class Human {
    final private String sex;
    int age;
    boolean premium;

    public Human(String sex) {
        this(sex, false);
        premium = true;
    }

    private Human(String sex, boolean premium) {
        this.sex = sex;
        this.premium = premium;
    }

    //secure method
    public static Human getNewPremiumMember() {
     return new Human("male", true);
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", premium=" + premium +
                '}';
    }
}
