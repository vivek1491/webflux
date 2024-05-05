package com.vk.userservice.mapper;

import com.vk.userservice.entities.User;
import com.vk.userservice.model.UserDto;

public class UserMapper {

   public static User FromDto(UserDto userDto){

          User user=new User();
          user.setUserId(userDto.getId());
          user.setName(userDto.getName());
          user.setPhone(userDto.getPhone());
          user.setPassword(userDto.getPassword());
          user.setEmailId(userDto.getEmail());
          return user;
    }

    public static UserDto toDto(User user){

        UserDto userdto=new UserDto();
        userdto.setId(user.getUserId());
        userdto.setName(user.getName());
        userdto.setPhone(user.getPhone());
        userdto.setPassword(user.getPassword());
        userdto.setEmail(user.getEmailId());
        return userdto;
    }
}
