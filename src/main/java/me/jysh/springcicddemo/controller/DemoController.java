package me.jysh.springcicddemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/v2/greet")
  public ResponseEntity<String> getGreeted() {
    return ResponseEntity.ok("Hi! Welcome to my World!");
  }

  @GetMapping("/v2/cheer")
  public ResponseEntity<String> getCheer() {
    return ResponseEntity.ok("Hi! Hope you have an amazing day!!");
  }
}
