package com.mycompany.repository;

import com.mycompany.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{

    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("/home/victoria/movies.txt",true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
