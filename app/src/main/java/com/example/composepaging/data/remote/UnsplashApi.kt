package com.example.composepaging.data.remote

import com.example.composepaging.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    @Headers("Authorization: Client-ID")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page:Int,
        @Query("per_page") per_page:Int
    ):List<UnsplashImage>
}