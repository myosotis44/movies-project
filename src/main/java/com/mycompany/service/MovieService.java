package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository=new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
