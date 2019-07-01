package com.lits.demo.implementation;

import com.lits.demo.model.UserEntity;
import com.lits.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserEntity userEntity = userDataRepository.findOneByUsername(s);
        if (Objects.isNull(userEntity)) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        System.out.println("userEntity from UserServiceImpl is "+userEntity);
    return new User(userEntity.getUsername(),userEntity.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }

    public UserEntity save (UserEntity user){
        userDataRepository.save(user);
        return user;
    }
}