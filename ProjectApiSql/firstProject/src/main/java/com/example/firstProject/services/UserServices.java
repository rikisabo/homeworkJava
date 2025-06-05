package com.example.firstProject.services;

import com.example.firstProject.entities.Users;
import com.example.firstProject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServices {
    private final UserRepository userRepository;
    public Users findUserById(int id)
    {
        return userRepository.findById(id).orElse(null);
    }
    public Users updateTable(Users user)
    {
        return userRepository.save(user);
    }
    public boolean deleteUserByName(String name, int id) {

        Optional<Users> userOptional = userRepository.findById(id);
        if (userOptional.isPresent() && userOptional.get().getName().equals(name)) {
            userRepository.deleteById(id);
            return true;
        }

        return false;
    }
    public boolean updateUserName(int id, String newName) {
        Optional<Users> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            Users user = userOptional.get();
            user.setName(newName);
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
