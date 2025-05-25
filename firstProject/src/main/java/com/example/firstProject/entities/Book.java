package com.example.firstProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
@Entity
public class Book extends Item {
    private  String name;
    private  String author;
    @Enumerated(EnumType.STRING)
    private Category category;
}
