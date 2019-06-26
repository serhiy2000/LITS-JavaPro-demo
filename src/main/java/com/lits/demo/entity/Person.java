package com.lits.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "person")
@ToString(exclude = {"id" , "age" , "dead"})
@EqualsAndHashCode(exclude = {"id"})
@Data
@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String username;
    private Integer age;
    private boolean dead;
}
