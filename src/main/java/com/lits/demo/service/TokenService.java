package com.lits.demo.service;

public interface TokenService {
    Long parseToken (String token);

    String createToken (Long id);
}
