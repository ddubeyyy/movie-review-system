package com.example.moviereviews.repository;

import com.example.moviereviews.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
