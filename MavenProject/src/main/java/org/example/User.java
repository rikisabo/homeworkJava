package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="newTable")
public class User {
    @Id
    private int id;
    private String name;
    private String Email;

}
