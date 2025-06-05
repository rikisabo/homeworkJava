package com.example.firstProject.services;

import com.example.firstProject.entities.Lending;
import com.example.firstProject.entities.Users;
import com.example.firstProject.repository.LendingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class LendingService {
    private final LendingRepository lendingRepository;
    public Lending findLendingById(int id)
    {
        return lendingRepository.findById(id).orElse(null);
    }
    public Lending updateTable(Lending lending)
    {
        return lendingRepository.save(lending);
    }
    public boolean deleteById( int id) {

        Optional<Lending> userOptional = lendingRepository.findById(id);

        if (userOptional.isPresent()) {
            lendingRepository.deleteById(id);
            return true;
        }

        return false;
    }
    public boolean updateIsReturnedById(int id, boolean is_returned) {
        Optional<Lending> lendingOptional = lendingRepository.findById(id);
        if (lendingOptional.isPresent()) {
            Lending lending = lendingOptional.get();
            lending.setReturned(is_returned);
            lendingRepository.save(lending);
            return true;
        }
        return false;
    }
}
