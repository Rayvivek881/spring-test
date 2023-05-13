package com.vivek.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
  @Autowired
  private MovieService movieService;
  @GetMapping
  public ResponseEntity<List<Movie>> get_all_movies() {
    return new ResponseEntity<List<Movie>>(movieService.get_all_movies(), HttpStatus.OK);
  }
  @GetMapping("/single/${id}")
  public ResponseEntity<Optional<Movie>> single_movie(@PathVariable ObjectId id) {
    return new ResponseEntity<Optional<Movie>>(movieService.single_movies(id), HttpStatus.OK);
  }
  @GetMapping("/ImdbId/${ImdbId}")
  public ResponseEntity<Optional<Movie>> single_movieImdbId(@PathVariable String ImdbId) {
    return new ResponseEntity<Optional<Movie>>(movieService.single_moviesImdbId(ImdbId), HttpStatus.OK);
  }
}