package com.example.restapi.Repository

import com.example.restapi.Model.Movie
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface MovieRepository : JpaRepository<Movie, Long> {
    fun findMovieById(id: Long): Optional<Movie>
}