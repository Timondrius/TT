package com.example.TT.controller;

import com.example.TT.dto.RegistrationRequest;
import com.example.TT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping( "/register")
    public String register(@RequestBody RegistrationRequest request) {
        System.out.println(request);
        return userService.register(request);
    }
}
