package com.example.MovieService.service;

import com.example.MovieService.model.Movie;
import com.example.MovieService.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public Movie getMovieById(String movieID) {
        Optional movieOpt = movieRepository.findById(movieID);
        if(movieOpt.isPresent())
        {
            Movie movie= (Movie) movieOpt.get();
            return movie;
        }

        return null;
    }

    @Override
    public List<Movie> getMovieByMovieName(String name) {
        List<Movie> movieByName= movieRepository.findAll().stream().filter(t->t.getName().equals(name)).collect(Collectors.toList());
        return movieByName;
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movieList= movieRepository.findAll();
        return movieList;
    }

    @Override
    public Movie addMovie(Movie movie) {
        Movie addedMovie= movieRepository.save(movie);
        return addedMovie;
    }

    @Override
    public Movie updateMovie(Movie movie) {
     Movie updatedMovie= movieRepository.save(movie);
        return updatedMovie;
    }

    @Override
    public String deleteMovieByID(String movieID) {
        movieRepository.deleteById(movieID);
        return "Deleted Successfully";
    }
}
