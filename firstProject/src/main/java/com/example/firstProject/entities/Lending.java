package com.example.firstProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Lending {
  @Id
  private int id;
  private Date Date;
  private boolean isReturned;
  @ManyToOne
  private Users user;
}
