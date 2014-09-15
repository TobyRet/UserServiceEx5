package com.codurance;

public class UserService {

    private Repository repository;
    private InputValidation inputValidation;

    public UserService(Repository repository, InputValidation inputValidation) {
        this.repository = repository;
        this.inputValidation = inputValidation;
    }

    public void save(User user) {
        if(!inputValidation.checkName(user)) {
            throw new RuntimeException("User does not have a valid name");
        };
        repository.create(user);
    }
}
