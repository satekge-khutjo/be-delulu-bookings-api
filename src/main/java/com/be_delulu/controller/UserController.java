package com.be_delulu.controller;

import com.be_delulu.dto.UserRequestDTO;
import com.be_delulu.dto.UserResponseDTO;
import com.be_delulu.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserResponseDTO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public UserResponseDTO createUser(@RequestBody UserRequestDTO dto) {
        return userService.registerUser(dto);
    }
}