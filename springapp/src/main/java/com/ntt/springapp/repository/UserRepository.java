package com.ntt.springapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ntt.springapp.models.Users;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
  boolean existsByUsername(String username);
}
