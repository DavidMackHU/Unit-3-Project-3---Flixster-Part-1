package com.example.unit3project3_flixsterpart1

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("poster_path")
    val posterPath: String? = null
)
