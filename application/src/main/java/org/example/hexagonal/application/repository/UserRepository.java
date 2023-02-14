package org.example.hexagonal.application.repository;

import org.example.hexagonal.application.dto.UserDTO;
import java.util.List;

public interface UserRepository {

    List<UserDTO> getAllUsers();

}
