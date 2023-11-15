package com.mycompany.controller;

import com.mycompany.entity.Movie;
import com.mycompany.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {

    // MovieService service = new MovieService();
    private MovieServiceInterface movieService;

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {

        System.out.println( "Quel est le titre du film à ajouter?" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "Quel est le genre du film à ajouter?" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}


