package com.chamath.auth_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponseDTO {

    private final String token;

//    public LoginResponseDTO(String token){
//        this.token = token;
//    }
}
