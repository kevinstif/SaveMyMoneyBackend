package com.smw.security.domain.model.entity;

import lombok.Data;

@Data
public class AuthCredentials {
    private String email;
    private String password;
}
