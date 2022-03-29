package com.example.MovieService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {

    @Id
    private String movieID;
    private String name;
    private float reco_rating;
    private int year;


    public Movie()
    {

    }



    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getReco_rating() {
        return reco_rating;
    }

    public void setReco_rating(float reco_rating) {
        this.reco_rating = reco_rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Movie(String movieID, String name, float reco_rating, int year) {
        this.movieID = movieID;
        this.name = name;
        this.reco_rating = reco_rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieID='" + movieID + '\'' +
                ", name='" + name + '\'' +
                ", reco_rating=" + reco_rating +
                ", year=" + year +
                '}';
    }
}
