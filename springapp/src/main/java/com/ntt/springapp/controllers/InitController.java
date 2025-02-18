package com.ntt.springapp.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InitController {
  @GetMapping("")
  public Map<String, String> init() {
    return Map.of("message", "App spring boot 1");
  }
}
