package com.lits.demo.service.impl;

import com.lits.demo.model.UserEntity;
import com.lits.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        UserEntity userEntity =
    return null;
    }

    @Autowired
    private UserDataRepository userDataRepository;

    public UserEntity save (UserEntity user){

    }


}
