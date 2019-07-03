package com.lits.demo.dtos;

import com.lits.demo.entity.Person;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class PersonDto {

    @NotNull
    private Integer Id;

    @Min(value = 10)
    @Max(value = 50)
    private String personName;

    private Integer age;

    private boolean dead;
}
