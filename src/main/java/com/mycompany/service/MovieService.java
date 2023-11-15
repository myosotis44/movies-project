package com.mycompany.service;

import com.mycompany.entity.Movie;
import com.mycompany.repository.GoLiveMovieRepository;
import com.mycompany.repository.MovieRepository;

public class MovieService {

    //private MovieRepository movieRepository=new MovieRepository();
    private GoLiveMovieRepository goLiveMovieRepository=new GoLiveMovieRepository();

    public void registerMovie(Movie movie) {
        goLiveMovieRepository.add(movie);
    }
}
