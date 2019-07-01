package com.lits.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id", unique = true, nullable = false)
        private long id;

        @Column(name = "username", unique = true)
        private String username;

        @Column(name = "password")
        private String password;


}
