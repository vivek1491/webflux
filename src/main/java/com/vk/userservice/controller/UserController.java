package com.vk.userservice.controller;

import com.vk.userservice.model.UserDto;
import com.vk.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
 @Autowired
  private UserService userService;

    @PostMapping(name = "/createUser",value = "/createUser")
    ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
       UserDto userDto=null;
       try {
           userDto=userService.createUser(user);
           return new ResponseEntity<>(userDto,HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(userDto,HttpStatus.BAD_REQUEST);
       }

    }


}
