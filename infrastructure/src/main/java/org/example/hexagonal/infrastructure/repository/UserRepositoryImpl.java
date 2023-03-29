package org.example.hexagonal.infrastructure.repository;

import org.example.hexagonal.application.repository.UserRepository;
import org.example.hexagonal.domain.User;
import org.example.hexagonal.infrastructure.entity.UserEntity;
import org.example.hexagonal.infrastructure.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

  private final UserRepositorySpringDataJPA userRepositorySpringDataJPA;

  @Autowired
  public UserRepositoryImpl(UserRepositorySpringDataJPA userRepositorySpringDataJPA) {
    this.userRepositorySpringDataJPA = userRepositorySpringDataJPA;
  }

  @Override
  public List<User> findAllUsers() {
    var usersEntity = userRepositorySpringDataJPA.findAll();
    var users = new ArrayList<User>();
    for (UserEntity ue : usersEntity) {
      users.add(UserMapper.INSTANCE.userEntityToUser(ue));
    }
    return users;
  }

  @Override
  public User saveUser(User user) {
    var userEntitySaved = userRepositorySpringDataJPA.save(UserMapper.INSTANCE.userToUserEntity(user));
    return UserMapper.INSTANCE.userEntityToUser(userEntitySaved);
  }

  @Override
  public void deleteUser(long userId) {
    userRepositorySpringDataJPA.deleteById(userId);
  }
}
