package com.devtiro.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
// Allows us to create a simple rest api with little code
import org.springframework.web.bind.annotation.RestController;

/** HelloWorldController */
@RestController
public class HelloWorldController {

  @GetMapping(path = "/hello")
  public String helloWorld() {
    return "Hello Devtrio!";
  }
}
