package com.codurance;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class UserValidation implements Validation {
    @Override
    public boolean checkName(User newUser) {
        return newUser.getName() == "" ? false : true;
    }
}
