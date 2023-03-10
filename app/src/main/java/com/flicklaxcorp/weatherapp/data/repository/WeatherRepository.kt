package com.flicklaxcorp.weatherapp.data.repository

import com.flicklaxcorp.weatherapp.data.network.APIService
import com.flicklaxcorp.weatherapp.domain.model.DogBreedResponse
import com.flicklaxcorp.weatherapp.util.Resource
import timber.log.Timber
//import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherRepository @Inject constructor(
    private val apiService: APIService
){

    suspend fun getDog() : Resource<DogBreedResponse> {
        val response = try {
            apiService.getRandomDog()
        } catch (e: Exception) {
            return Resource.Error("Unknown Error occurred.")
        }

        Timber.d("DEBUG MESSAGE")
        return Resource.Success(response)
    }


}