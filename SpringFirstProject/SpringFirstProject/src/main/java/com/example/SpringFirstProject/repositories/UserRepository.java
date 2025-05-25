package com.example.SpringFirstProject.repositories;

import com.example.SpringFirstProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
