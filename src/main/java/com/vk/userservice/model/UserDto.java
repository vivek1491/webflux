package com.vk.userservice.model;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {
 private Long id;
 private String name;
 private String email;
 private  String password;
 private List<AddressDto> address;
 private String phone;




}
