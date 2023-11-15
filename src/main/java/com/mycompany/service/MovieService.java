package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{
    private MovieRepositoryInterface movieRepositoryInterface;

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    public void registerMovie(Movie movie) {
        movieRepositoryInterface.add(movie);
    }
}
