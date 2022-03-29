package com.example.MovieService.service;

import com.example.MovieService.model.Movie;
import java.util.List;


public interface MovieService {

    public Movie getMovieById(String movieID);

    public List<Movie> getMovieByMovieName(String name);

    public List<Movie> getAllMovies();

    public  Movie addMovie(Movie movie);

    public Movie updateMovie(Movie movie);

    public String deleteMovieByID(String movieID);

}
