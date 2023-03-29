package org.example.hexagonal.infrastructure.controller;

import org.example.hexagonal.infrastructure.dto.UserDTO;
import org.example.hexagonal.application.service.UserService;
import org.example.hexagonal.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/users")
  public ResponseEntity<List<UserDTO>> getAllUsers() {
    var usersDTO = userService.findAllUsers().stream()
            .map(UserMapper.INSTANCE::userToUserDTO)
            .toList();
    return ResponseEntity.ok(usersDTO);
  }

  @PostMapping("/users")
  public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
    var savedUser = userService.saveUser(UserMapper.INSTANCE.userDTOtoUser(userDTO));
    return new ResponseEntity<>(UserMapper.INSTANCE.userToUserDTO(savedUser), HttpStatus.CREATED);
  }

  @DeleteMapping("/users/{userId}")
  public ResponseEntity<Void> removeUser(@PathVariable long userId) {
    userService.deleteUser(userId);
    return ResponseEntity.ok().build();
  }
}
