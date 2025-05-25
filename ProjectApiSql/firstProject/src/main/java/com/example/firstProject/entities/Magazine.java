package com.example.firstProject.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Magazine extends Item {
    private int year;
    private int sheet;
}
