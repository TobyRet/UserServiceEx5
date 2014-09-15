package com.codurance;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class UserNameValidation implements InputValidation {
    @Override
    public boolean checkName(User newUser) {
        if (newUser.getFirstName().equals("") || newUser.getLastName().equals("")) {
            return false;
        } else {
            return true;
        }
    }
}
