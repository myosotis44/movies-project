package com.mycompany.repository;

import com.mycompany.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static List<Movie> movies= new ArrayList<>();
    public void add (Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");

    }
}
