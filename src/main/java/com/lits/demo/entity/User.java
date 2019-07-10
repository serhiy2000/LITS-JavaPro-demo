package com.lits.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
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

}
