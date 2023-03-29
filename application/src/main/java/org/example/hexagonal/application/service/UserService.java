package org.example.hexagonal.application.service;

import org.example.hexagonal.domain.User;
import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    User saveUser(User user);

    void deleteUser(long userId);
}