package com.example.movieapp2.models

class Movies {
    val imdbID: String
    val Title: String
    val Plot: String
    val Director: String
    val Actors: String


    constructor(
        imdbID: String,
        Title: String,
        Plot: String,
        Director: String,
        Actors: String
    ) {
        this.imdbID = imdbID
        this.Title = Title
        this.Plot = Plot
        this.Director = Director
        this.Actors = Actors
    }
}