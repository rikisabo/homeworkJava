package com.example.firstProject.controllers;

import com.example.firstProject.entities.Lending;
import com.example.firstProject.services.LendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Lending")
@RequiredArgsConstructor
public class LendingController {
    private final LendingService lendingService;

    @GetMapping("/getLendingById/{id}")
    public Lending getLendingById(@PathVariable int id) {
        return lendingService.findLendingById(id);
    }
    @PostMapping("/updateIsReturnedById/{id}/{is_returned}")
    public boolean updateIsReturnedById(@RequestBody int id, @RequestBody boolean is_returned) {
        return lendingService.updateIsReturnedById(id,is_returned);
    }
    @DeleteMapping("/deleteLending/{id}")
    public ResponseEntity<String> deleteLendingById(@PathVariable int id) {
        if(lendingService.deleteById(id)) {
            return ResponseEntity.ok(" ID " + id + " deleted successfully.");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID " + id + " not found.");

    }
}
