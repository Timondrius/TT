package com.example.TT.service;

import com.example.TT.dto.LoginRequest;
import com.example.TT.dto.RegistrationRequest;
import com.example.TT.model.User;
import com.example.TT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String register(RegistrationRequest request) {
        Optional<User> existingUser = userRepository.findByUsername(request.getUsername());
        if (existingUser.isPresent()) {
            return "User already exists";
        }
        if(!request.getPassword().equals(request.getAPassword())) return "Passwords do not match";
        User user = new User(request.getUsername(), request.getPassword(), request.getName(), request.getSName(), request.getLink());
        userRepository.save(user);
        return "Thank you for registering";
    }

    public String login(LoginRequest request) {
        Optional<User> user = userRepository.findByUsername(request.getUsername());
        if (user.isEmpty()) {
            return "User does not exist";
        }

        if(user.get().auth(request.getPassword())) return "You have been logged in";
        return "Invalid password";
    }
}
