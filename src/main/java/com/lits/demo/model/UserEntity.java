package com.lits.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        @Column(name = "id", unique = true, nullable = false)
        private long id;

        @Column(name = "username", unique = true)
        private String username;

        @Column(name = "password")
        private String password;

        @Column(name = "role")
        private String role;

}
