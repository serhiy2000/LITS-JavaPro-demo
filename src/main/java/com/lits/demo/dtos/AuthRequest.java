package com.lits.demo.dtos;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AuthRequest {
    @NotEmpty
    @Size(max = 64)
    private String username;

    @NotEmpty
    @Size(max = 32)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
