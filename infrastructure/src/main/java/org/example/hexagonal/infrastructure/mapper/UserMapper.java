package org.example.hexagonal.infrastructure.mapper;

import org.example.hexagonal.domain.User;
import org.example.hexagonal.infrastructure.dto.UserDTO;
import org.example.hexagonal.infrastructure.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDTOtoUser(UserDTO userDTO);

    UserDTO userToUserDTO(User user);

    UserEntity userToUserEntity(User user);

    User userEntityToUser(UserEntity userEntity);
}
