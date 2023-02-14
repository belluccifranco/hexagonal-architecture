package org.example.hexagonal.application.service;

import org.example.hexagonal.application.dto.UserDTO;
import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();

}