package com.example.restapi.Controlller

import com.example.restapi.Model.Movie
import com.example.restapi.Service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/movies")
class MovieController(private val service: MovieService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody  movie: Movie): Movie = service.create(movie)

    @GetMapping
    fun getAll(): List<Movie> = service.getAll()

    @DeleteMapping
    fun removeAll() = service.removeAll()
}