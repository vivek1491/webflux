package com.vk.userservice.model;

import lombok.Data;

@Data
public class AddressDto {
    private Long addressId;
    private String street;
    private String city;
    private  String landMark;
}
