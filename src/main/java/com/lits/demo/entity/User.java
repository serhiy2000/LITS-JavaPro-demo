package com.lits.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_db")
@Data
public class User {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name = "id", unique = true, nullable = false)
        private Long id;

        @Column(name = "username", unique = true)
        private String username;

        @Column(name = "password")
        private String password;

        @Column(name = "role")
        private String role;

        @ElementCollection(targetClass = Role.class, fetch = FetchType.LAZY)
        @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
        @Enumerated(EnumType.STRING)
        private Set<Role> roles;


}
