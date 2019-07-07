package com.lits.demo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table (name = "person")
//@ToString(exclude = {"id" , "age" , "dead"})
//@EqualsAndHashCode(exclude = {"id"})
@Data
//@Builder
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
        private Integer id;

    @Column(name = "personName", nullable = false)
    private String personName;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "dead")
    private boolean dead;

}
