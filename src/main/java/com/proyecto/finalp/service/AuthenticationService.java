package com.proyecto.finalp.service;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        return username.equalsIgnoreCase("Gonzalo") && password.equalsIgnoreCase("Gonzalo");

    }

}
