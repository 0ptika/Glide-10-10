package com.example.navigation_component.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create



object  RetrofitService {
    private const val BASE_URL = "https://uselessfacts.jsph.pl"
    private const val BASE_URL_MEMS = "https://api.imgflip.com"

    private val retrofit: Retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    val apiService:ApiService = retrofit.create(ApiService::class.java)

    private val retrofitMems: Retrofit = Retrofit.Builder().baseUrl(BASE_URL_MEMS).addConverterFactory(GsonConverterFactory.create()).build()
    val apiServiceMems:ApiService = retrofit.create(ApiService::class.java)





}


