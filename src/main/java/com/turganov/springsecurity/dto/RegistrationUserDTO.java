package com.turganov.springsecurity.dto;

import lombok.Data;

@Data
public class RegistrationUserDTO {

    private String username;
    private String password;
    private String confirmPassword;
    private String email;

}
