package org.example.hexagonal.infrastructure.repository;

import org.example.hexagonal.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>,
        org.example.hexagonal.application.repository.UserRepository {

}
