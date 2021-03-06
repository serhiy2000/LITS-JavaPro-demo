package com.lits.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name = "id", unique = true, nullable = false)
        private long id;

        @Column(name = "email", unique = true)
        private String email;

        @Column(name = "password")
        private String password;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

}
