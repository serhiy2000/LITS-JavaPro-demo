package com.lits.demo.implementation;

import com.lits.demo.model.UserEntity;
import com.lits.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        UserEntity userEntity =
    return null;
    }


    public UserEntity save (UserEntity user){

        userDataRepository.save(user);

        return null;
    }


}
