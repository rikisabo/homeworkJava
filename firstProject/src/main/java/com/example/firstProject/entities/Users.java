package com.example.firstProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Users")
public class Users {
    @Id
    private int id;
    private String name;
    private String Email;

}
