package com.codurance;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserServiceShould {
    private static final User NEW_USER = new User("toby");
    private UserService userService;
    private Repository repository;

    @Test public void
    create_user() {
        repository = mock(Repository.class);
        userService = new UserService(repository);
        userService.save(NEW_USER);
        verify(repository).create(NEW_USER);
    }


}