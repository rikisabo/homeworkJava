package com.example.firstProject.services;

import com.example.firstProject.entities.Users;
import com.example.firstProject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServices {
    private final UserRepository userRepository;
    public Users findUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    public Users updateTable(Users user) {
        return userRepository.save(user);

    }
}
