package com.mycompany;

import com.mycompany.controller.MovieController;
import com.mycompany.entity.Movie;
import com.mycompany.repository.GoLiveMovieRepository;
import com.mycompany.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovieService movieService=new MovieService();
        GoLiveMovieRepository goLiveMovieRepository=new GoLiveMovieRepository();
        movieService.setMovieRepositoryInterface(goLiveMovieRepository);
        MovieController movieController = new MovieController();
        movieController.setMovieServiceInterface(movieService);
        movieController.addUsingConsole();

    }
}
