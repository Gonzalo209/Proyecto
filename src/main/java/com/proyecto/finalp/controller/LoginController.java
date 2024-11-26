package com.proyecto.finalp.controller;

import com.proyecto.finalp.service.AuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;

    }

    @GetMapping
    public String gotoLoginPage() {

        return "login";

    }

    @PostMapping
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        model.put("name", name);
        model.put("password", password);

        if(authenticationService.authenticate(name, password)) {

            return "welcome";

        }

        model.put("errorMessage", "Invalid username or password");

        return "login";

    }

}