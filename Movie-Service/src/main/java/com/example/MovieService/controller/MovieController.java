package com.example.MovieService.controller;

import com.example.MovieService.model.Movie;
import com.example.MovieService.service.MovieService;
import com.example.MovieService.service.MovieServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/{movieID}")
    @Operation(summary = "Get Movies by Movie Id")
    public Movie getMovieByID(@PathVariable String movieID)
    {
        Movie movie=movieService.getMovieById(movieID);
        return movie;
    }

    @GetMapping("/name/{name}")
    @Operation(summary = "Get Movies by Movie name")
    public List<Movie> getMovieByName(@PathVariable String name)
    {
        List<Movie> movieByMovieName=movieService.getMovieByMovieName(name);
        return movieByMovieName;
    }

    @GetMapping("/movies")
    @Operation(summary = "Get List of all movies")
    public List<Movie> getAllMovies()
    {
        List<Movie> movieList=movieService.getAllMovies();
        return movieList;
    }

    @PostMapping("/addMovie")
    @Operation(summary = "Add Movie")
    public Movie addMovie(@RequestBody Movie movie)
    {
        Movie addedMovie=movieService.addMovie(movie);
        return addedMovie;
    }

    @PutMapping("/updateMovie")
    @Operation(summary = "Update Movie")
    public Movie updateMovie(@RequestBody Movie movie)
    {
        Movie updatedMovie=movieService.addMovie(movie);
        return updatedMovie;
    }

    @DeleteMapping("/id/{movieID}")
    @Operation(summary = "Delete a movie movie by Movie Id")
    public String deleteMovieById(@PathVariable String movieID)
    {
        movieService.deleteMovieByID(movieID);
        return "Deleted Successfully";
    }



}
