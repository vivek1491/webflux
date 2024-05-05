package com.vk.userservice.entities;



import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "userDetails")
@Data
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long userId;

    @Column(name = "email")
    private String emailId;

    @Column(name = "name")
    private String  name;

     @Column(name = "password")
     private String  password;

     @Column(name = "phone")
     private String phone;

     @OneToMany(mappedBy = "addressId",cascade =CascadeType.ALL )
     List<Address> address;
}
