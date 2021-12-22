package com.example.wheatherapp.features.weather_info_show.model

import com.example.wheatherapp.common.RequestCompleteListener
import com.example.wheatherapp.features.weather_info_show.model.data_class.City
import com.example.wheatherapp.features.weather_info_show.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback: RequestCompleteListener<MutableList<City>>)
    fun getWeatherInfo(cityId: Int, callback: RequestCompleteListener<WeatherInfoResponse>)
}