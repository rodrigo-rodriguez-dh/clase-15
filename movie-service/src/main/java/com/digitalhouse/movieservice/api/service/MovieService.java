package com.digitalhouse.movieservice.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.digitalhouse.movieservice.domain.models.Movie;
import com.digitalhouse.movieservice.domain.repositories.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository repository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.repository = movieRepository;
    }

    public List<Movie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    }

    public List<Movie> findByGenre(String genre, Boolean throwError) {
        if (throwError)
            throw new RuntimeException();
        return repository.findByGenre(genre);
    }

    public Movie save(Movie movie) {
        return repository.save(movie);
    }

}
