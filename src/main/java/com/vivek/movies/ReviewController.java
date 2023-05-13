package com.vivek.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
  @Autowired
  private ReviewService reviewService;
  
  @PostMapping
  public ResponseEntity<Review> create_review(@RequestBody Map<String, String> payload) {
    return ResponseEntity.ok(reviewService.create_review(payload.get("reviewBody"), payload.get("imdbId")));
  }
}
