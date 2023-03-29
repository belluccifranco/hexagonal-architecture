package org.example.hexagonal.application.repository;

import org.example.hexagonal.domain.User;
import java.util.List;

public interface UserRepository {

    List<User> findAllUsers();

    User saveUser(User user);

    void deleteUser(long userId);
}
