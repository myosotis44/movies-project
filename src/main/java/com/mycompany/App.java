package com.mycompany;

import com.mycompany.controller.MovieController;
import com.mycompany.repository.FileMovieRepository;
import com.mycompany.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Classe exécutable de l'application Movies-project
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieController movieController = context.getBean(MovieController.class);
        /*
        AVANT L'UTILISATION DES BEANS AVEC SPRING CONTEXT
            DefaultMovieService defaultMovieService =new DefaultMovieService();
            FileMovieRepository fileMovieRepository=new FileMovieRepository();
            defaultMovieService.setMovieRepository(fileMovieRepository);
            MovieController movieController = new MovieController();
            movieController.setMovieService(defaultMovieService);
        */
        movieController.addUsingConsole();

    }
}
