package com.vk.userservice.model;

import lombok.Data;

@Data
public class UserDto {
 private Long id;
 private String name;
 private String email;
 private  String password;
 private AddressDto address;
 private String phone;




}
