package com.example.javacontainer.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 


class Human {
  private String name;
  private String surname;

  public Human(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getSurname() {
    return surname;
  }
  public void setSurname(String surname) {
    this.surname = surname;
  }
  
}

@RestController
class UserController {
  @GetMapping("/greeting")
  public String home(Model model) {

      return "Hello wolrd";
  }


  @RequestMapping("")
  public Human test(Model model) {
      return new Human("Auttapon", "siriwaramas");
  }
}