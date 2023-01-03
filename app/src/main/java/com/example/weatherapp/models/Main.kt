package com.example.weatherapp.models

import java.io.Serializable

data class Main (val temp: Double,
                 val pressure: Double,
                 val humidity: Double,
                 val tempMin: Double,
                 val tempMax: Double,
                 val sea_level: Double,
                 val gmd_level: Double,
                 ): Serializable