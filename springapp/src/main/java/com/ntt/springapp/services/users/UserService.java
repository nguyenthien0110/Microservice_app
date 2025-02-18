package com.ntt.springapp.services.users;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ntt.springapp.payload.users.UserRequest;

@Service
public interface UserService {
  ResponseEntity<Object> getAll();

  ResponseEntity<Object> delete(String id);

  ResponseEntity<Object> create(UserRequest userRequest);
}
