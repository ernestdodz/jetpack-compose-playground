package com.flicklaxcorp.weatherapp.ui.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.flicklaxcorp.weatherapp.data.repository.WeatherRepository
import com.flicklaxcorp.weatherapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

import kotlinx.coroutines.launch

import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: WeatherRepository
) : ViewModel() {

    init {
        Timber.d("sample text")
        loadRandomDog()
    }

    private fun loadRandomDog() {
        viewModelScope.launch {
            Timber.d( "IT SHOULD WORKK")
            when(val result = repository.getDog()) {
                is Resource.Success -> {
                    Timber.d(result.data?.message)
                }
                is Resource.Error -> {
                    Timber.e(result.message)
                }
            }
        }
    }

}