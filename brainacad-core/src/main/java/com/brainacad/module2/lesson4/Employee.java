package com.brainacad.module2.lesson4;

public class Employee {

    private static int numberOfEmployees;
    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;

    public Employee() {
        numberOfEmployees++;
    }

    public Employee(String firstName, String lastName, String occupation, int telephone) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

}
