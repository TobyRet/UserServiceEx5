package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tobyretallick on 12/09/2014.
 */
public class UserRepositoryShould {
    private static final User NEW_USER = new User("toby");
    private Validation validation;

    @Test public void
    verify_user_name_before_creating() {
        validation = mock(Validation.class);
        UserRepository userRepository = new UserRepository(validation);
        userRepository.create(NEW_USER);
        verify(validation).checkName(NEW_USER);
    }
}
