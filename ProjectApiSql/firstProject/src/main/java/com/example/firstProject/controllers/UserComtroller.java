package com.example.firstProject.controllers;

import com.example.firstProject.entities.Users;
import com.example.firstProject.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserComtroller {
    private final UserServices userService;
    @GetMapping("/getUserById/{id}")
    public Users getUserById(@PathVariable int id) {
        return userService.findUserById(id);
    }
    @PostMapping("/updateTable")
    public Users updateTable(@RequestBody Users user) {
        return userService.updateTable(user);
    }

}
