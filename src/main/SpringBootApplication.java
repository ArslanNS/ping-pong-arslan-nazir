package com.example.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootApplication {

  public static void main(final String[] args) {
    SpringApplication.run(SpringBootApplication.class, args);
  }

}
