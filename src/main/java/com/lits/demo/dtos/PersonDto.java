package com.lits.demo.dtos;

import lombok.Data;

@Data
public class PersonDto {
    private Integer Id;
    private String username;
    private Integer age;
    private boolean dead;
}
