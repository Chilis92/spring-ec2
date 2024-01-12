package com.abrhernandez.demo.apimodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DogApiModel {

    private Integer id;
    private String name;
    private String color;
    private Integer age;
    private String gender;

}
