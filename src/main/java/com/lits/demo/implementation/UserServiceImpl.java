package com.lits.demo.implementation;

import com.lits.demo.entity.User;
import com.lits.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
        User user = userDataRepository.findOne(s);
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        System.out.println("user from UserServiceImpl is "+ user);
    return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }

    public User save (User user){
        userDataRepository.save(user);
        return user;
    }
}