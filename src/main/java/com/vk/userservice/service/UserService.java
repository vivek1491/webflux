package com.vk.userservice.service;

import com.vk.userservice.entities.User;
import com.vk.userservice.mapper.UserMapper;
import com.vk.userservice.model.UserDto;
import com.vk.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

     public UserDto createUser(UserDto userDto){

         User user= UserMapper.FromDto(userDto);
         user= userRepository.save(user);
         return  UserMapper.toDto(user);
     }


}
