package com.codurance;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class User {
    private final String lastName;
    private final String firstName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
