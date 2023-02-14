package org.example.hexagonal.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long userId;
    private String username;
    private String password;
    private Set<Role> roles;
}