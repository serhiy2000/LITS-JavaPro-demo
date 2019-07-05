package com.lits.demo.service;

import com.lits.demo.model.User;

public interface UserAuthService {
    String auth(String login, String pass);

    User save (User user);
}
