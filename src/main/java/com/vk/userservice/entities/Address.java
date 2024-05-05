package com.vk.userservice.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String street;
    private String city;
    private  String landMark;
  }
