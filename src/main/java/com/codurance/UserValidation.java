package com.codurance;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class UserValidation implements Validation {
    @Override
    public boolean checkName(User newUser) {
        if(newUser.getName() == "") {
            return false;
        } else {
            return true;
        }
    }
}
