package com.lits.demo.implementation;

import com.lits.demo.model.UserEntity;
import com.lits.demo.repository.UserDataRepository;
import com.lits.demo.service.AuthService;
import com.lits.demo.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public String auth(String username, String pass) {
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        username,
                        pass
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserEntity user = userDataRepository.findOneByUsername(username);

        return tokenService.createToken(user.getId());
    }
}
