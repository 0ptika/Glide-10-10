package com.example.navigation_component.data

import retrofit2.http.GET

interface ApiService {
    @GET("/api/v2/facts/random")
    suspend fun getFackt():FackBackResponse
}