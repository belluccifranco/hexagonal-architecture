package org.example.hexagonal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue
    private Long userId;

    private String username;

    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<RoleEntity> roles;

}
