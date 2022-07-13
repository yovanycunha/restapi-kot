package com.example.restapi.Model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "movies")
data class Movie(
    @Id @GeneratedValue
    val id: Long? = null,
    var title: String,
    val imdbId: String? = null
)