package com.codurance;

public class UserService {

    private Repository repository;

    public UserService(Repository repository) {
        this.repository = repository;
    }

    public void save(User user) {
        repository.create(user);
    }
}
