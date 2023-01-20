package com.example.geragev2.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private int id;
    private String number;
    private String brand;
    private String model;
    private String color;
    private int personId;
}
