package com.flicklaxcorp.weatherapp.data.network

import com.flicklaxcorp.weatherapp.domain.model.DogBreedResponse

import retrofit2.http.GET


interface APIService {

    @GET("breeds/image/random")
    suspend fun getRandomDog() : DogBreedResponse
}