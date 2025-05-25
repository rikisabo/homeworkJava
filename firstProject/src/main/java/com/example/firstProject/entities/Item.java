package com.example.firstProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING)

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
