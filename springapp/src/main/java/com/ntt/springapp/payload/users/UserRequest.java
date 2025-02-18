package com.ntt.springapp.payload.users;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
  private String firstName;
  private String LastName;
  private String username;
  private String password;
  private String createAt;
}
