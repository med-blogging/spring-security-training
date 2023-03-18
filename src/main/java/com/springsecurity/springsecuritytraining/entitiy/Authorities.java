package com.springsecurity.springsecuritytraining.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Authorities {

    @Id
    private Long id;
    private String username;
    private String authority;
}
