package com.ntt.springapp.services.users;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ntt.springapp.models.Users;
import com.ntt.springapp.payload.ResponseData;
import com.ntt.springapp.payload.users.UserRequest;
import com.ntt.springapp.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {
  @Autowired
  private UserRepository userRepository;

  @Override
  public ResponseEntity<Object> getAll() {
    List<Users> usersList = userRepository.findAll();
    if (!usersList.isEmpty()) {
      return ResponseEntity.ok().body(ResponseData.builder().status("OK").data(usersList).build());
    }
    return ResponseEntity.notFound().build();
  }

  @Override
  public ResponseEntity<Object> create(UserRequest userRequest) {
    Boolean existsByUsername = userRepository.existsByUsername(userRequest.getUsername());
    if (!existsByUsername) {
      Users users = Users.builder().firstName(userRequest.getFirstName()).LastName(userRequest.getLastName()).username(
          userRequest.getUsername()).password(userRequest.getPassword()).createAt(new Date()).build();
      userRepository.insert(users);
      return ResponseEntity.ok().body(ResponseData.builder().status("OK").data("Insert success").build());
    }
    return ResponseEntity.badRequest().build();
  }

  @Override
  public ResponseEntity<Object> delete(String id) {
    Optional<Users> users = userRepository.findById(id);
    if (users.isEmpty()) {
      return ResponseEntity.notFound().build();
    }
    userRepository.deleteById(id);
    return ResponseEntity.ok().body(ResponseData.builder().status("OK").data("Delete success").build());
  }
}
