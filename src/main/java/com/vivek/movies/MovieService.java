package com.vivek.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
  @Autowired
  private MovieRepository movieRepository;
  public List<Movie> get_all_movies() {
    return movieRepository.findAll();
  }
  public Optional<Movie> single_movies(ObjectId id) {
    return movieRepository.findById(id);
  }
  public Optional<Movie> single_moviesImdbId(String ImdbId) {
    return movieRepository.findMoveByImdbId(ImdbId);
  }
}
