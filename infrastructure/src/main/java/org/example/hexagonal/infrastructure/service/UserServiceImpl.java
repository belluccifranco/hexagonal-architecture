package org.example.hexagonal.infrastructure.service;

import org.example.hexagonal.application.dto.UserDTO;
import org.example.hexagonal.application.repository.UserRepository;
import org.example.hexagonal.application.service.UserService;
import org.example.hexagonal.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

}
