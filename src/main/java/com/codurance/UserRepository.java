package com.codurance;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class UserRepository implements Repository{
    private Validation validation;

    public UserRepository(Validation validation) {
        this.validation = validation;
    }

    @Override
    public void create(User user) {
        validation.checkName(user);
    }
}
