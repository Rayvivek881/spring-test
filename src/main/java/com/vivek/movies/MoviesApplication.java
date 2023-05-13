package com.vivek.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesApplication {
  public static void main(String[] args) {
    SpringApplication.run(MoviesApplication.class, args);
    System.out.println("Server started at http://localhost:8080/");
  }
}
