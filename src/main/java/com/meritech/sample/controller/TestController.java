package com.meritech.sample.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/test")
public class TestController {
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

//  @GetMapping("/user")
//  @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
//  public String userAccess() {
//    return "User Content.";
//  }

  @GetMapping("/test")
  public String customerUserAccess() {
    return "This is the test api.";
  }

  @PostMapping("/testapi")
  public String clientUserAccess() {
    return "Client User Board.";
  }

  @GetMapping("/clientAdmin")
  public String clientAdminAccess() {
    return "Client Admin Board.";
  }

  @GetMapping("/superAdmin")
  public String superAdminAccess() {
    return "Super Admin Board.";
  }
}
