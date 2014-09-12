package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class UserValidationShould {

    private final User VALID_USER_NAME = new User("toby");
    private UserValidation userValidation;
    private User INVALID_USER_NAME = new User("");

    @Test public void
    validate_user_name() {
        userValidation = new UserValidation();
        assertThat(userValidation.checkName(VALID_USER_NAME), is(true));
        assertThat(userValidation.checkName(INVALID_USER_NAME), is(false));

    }
}
