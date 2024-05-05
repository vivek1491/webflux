package com.vk.userservice.mapper;

import com.vk.userservice.entities.User;
import com.vk.userservice.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "userId",source = "userDto.id")
    @Mapping(target = "emailId",source = "userDto.email")
    @Mapping(target = "address",source = "userDto.address")
    User fromDto(UserDto userDto);
    @Mapping(target = "id",source = "userId")
    @Mapping(target = "email",source = "emailId")
    @Mapping(target = "address",source = "address")
    UserDto toDto(User user);
}
