package com.example.firstProject.controllers;

import com.example.firstProject.entities.Users;
import com.example.firstProject.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @DeleteMapping("/deleteUser/{name}/{id}")
    public ResponseEntity<String> deleteUserByName(@PathVariable String name, @PathVariable int id) {
      if(userService.deleteUserByName(name, id)) {
          return ResponseEntity.ok("User " + name + " with ID " + id + " deleted successfully.");
      }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User " + name + " with ID " + id + " not found.");

    }
    @PutMapping("/updateUser/{id}/{newName}")
    public ResponseEntity<String> updateUserName( @PathVariable int id , @PathVariable String newName) {
        if(userService.updateUserName(id, newName)) {
            return ResponseEntity.ok("User " + id + " with ID " + id + " updated successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User " + id + " with ID " + id + " not found.");
    }


}
