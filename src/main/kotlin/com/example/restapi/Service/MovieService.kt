package com.example.restapi.Service

import com.example.restapi.Model.Movie

interface MovieService {
    fun create(movie: Movie): Movie

    fun getAll(): List<Movie>

    fun removeAll()
}