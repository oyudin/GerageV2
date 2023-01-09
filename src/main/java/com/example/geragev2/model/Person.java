package com.example.geragev2.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private String surname;
}
