package com.javaguide.UserDTO.controller;

import com.javaguide.UserDTO.dto.UserLocationDto;
import com.javaguide.UserDTO.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user-location")
    public List<UserLocationDto> getAllUserLocation(){
        return userService.getAllUserLocation();
    }
}
