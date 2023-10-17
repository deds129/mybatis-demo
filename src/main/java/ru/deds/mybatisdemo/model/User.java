package ru.deds.mybatisdemo.model;

import lombok.Data;

@Data
public class User {
    
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private Gender gender;
    
    private enum Gender {
        MALE, FEMALE
    }
    
}
