package com.mycompany;

import com.mycompany.entity.Movie;
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

        System.out.println( "Quel est le titre du film à ajouter?" );
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println( "Quel est le genre du film à ajouter?" );
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        MovieService service = new MovieService();
        service.registerMovie(movie);

    }
}
