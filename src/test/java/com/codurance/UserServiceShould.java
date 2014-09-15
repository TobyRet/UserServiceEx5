package com.codurance;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceShould {
    private static final User NEW_VALID_USER = new User("toby", "retallick");
    private static final User NEW_INVALID_USER_FIRST_NAME = new User("", "retallick");
    private UserService userService;
    private Repository repository;
    private InputValidation inputValidation;

    @Before
    public void initialise() {
        repository = mock(Repository.class);
        inputValidation = mock(InputValidation.class);
        userService = new UserService(repository, inputValidation);
    }

    @Test(expected = RuntimeException.class) public void
    throw_exception_if_user_has_invalid_name() {
        when(inputValidation.checkName(NEW_INVALID_USER_FIRST_NAME)).thenReturn(false);
        userService.save(NEW_INVALID_USER_FIRST_NAME);
    }

    @Test public void
    save_a_user_if_it_has_valid_name() {
        when(inputValidation.checkName(NEW_VALID_USER)).thenReturn(true);
        userService.save(NEW_VALID_USER);
        verify(repository).create(NEW_VALID_USER);
    }




}