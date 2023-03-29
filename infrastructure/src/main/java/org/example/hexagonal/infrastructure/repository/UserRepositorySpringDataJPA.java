package org.example.hexagonal.infrastructure.repository;

import org.example.hexagonal.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepositorySpringDataJPA extends
        PagingAndSortingRepository<UserEntity, Long>,
        CrudRepository<UserEntity, Long> {}
