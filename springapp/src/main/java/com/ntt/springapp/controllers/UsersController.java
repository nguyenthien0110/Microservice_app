package com.ntt.springapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.springapp.payload.users.UserRequest;
import com.ntt.springapp.services.users.UserService;

@RestController
@RequestMapping("api/user")
public class UsersController {
  @Autowired
  private UserService userService;

  @GetMapping("get-all")
  public ResponseEntity<Object> getAll(){
    return userService.getAll();
  }

  @PostMapping("create")
  public ResponseEntity<Object> create(@RequestBody UserRequest userRequest){
    return userService.create(userRequest);
  }

  @DeleteMapping("delete/{id}")
  public ResponseEntity<Object> deleteById(@PathVariable("id") String id){
    return userService.delete(id);
  }
}
