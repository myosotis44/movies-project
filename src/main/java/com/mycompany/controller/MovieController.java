package com.mycompany.controller;

import com.mycompany.entity.Movie;
import com.mycompany.service.MovieService;

import java.util.Scanner;

public class MovieController {

    MovieService service = new MovieService();

    public void addUsingConsole() {

        System.out.println( "Quel est le titre du film à ajouter?" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "Quel est le genre du film à ajouter?" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        service.registerMovie(movie);
    }
}


