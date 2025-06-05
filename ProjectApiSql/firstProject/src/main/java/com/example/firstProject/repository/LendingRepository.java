package com.example.firstProject.repository;

import com.example.firstProject.entities.Lending;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LendingRepository extends JpaRepository<Lending, Integer> {
}
