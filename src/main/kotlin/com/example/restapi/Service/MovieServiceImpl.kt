package com.example.restapi.Service

import com.example.restapi.Model.Movie
import com.example.restapi.Repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(private val repository: MovieRepository): MovieService {
    override fun create(movie: Movie): Movie {
        return repository.save(movie)
    }

    override fun getAll(): List<Movie> {
        return repository.findAll()
    }

    override fun removeAll() {
        return repository.deleteAll()
    }


}