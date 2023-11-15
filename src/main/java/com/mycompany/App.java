package com.mycompany;

import com.mycompany.controller.MovieController;
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

        MovieController movieController = new MovieController();
        movieController.addUsingConsole();

    }
}
