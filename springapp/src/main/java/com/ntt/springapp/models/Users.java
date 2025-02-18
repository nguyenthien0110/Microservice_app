package com.ntt.springapp.models;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
  @Id
  private String id;
  private String firstName;
  private String LastName;
  private String username;
  private String password;
  @CreatedDate
  @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
  private Date createAt;
  @LastModifiedDate
  @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
  private Date updateAt;
  @LastModifiedBy
  @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
  private Date deleteAT;
}
