package com.flicklaxcorp.weatherapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview

import com.flicklaxcorp.weatherapp.ui.home.NavGraphs
import com.flicklaxcorp.weatherapp.ui.theme.WeatherTheme

import com.ramcosta.composedestinations.DestinationsNavHost


import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}


//@Composable
//fun HomeScreen() {
//    Text("wews")
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherTheme {
        //HomeScreen()
    }
}