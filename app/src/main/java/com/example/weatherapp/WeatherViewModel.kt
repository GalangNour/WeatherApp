package com.example.weatherapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapp.api.Constant
import com.example.weatherapp.api.NetworkResponse
import com.example.weatherapp.api.RetrofitInstance
import com.example.weatherapp.api.WeatherResponse
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel(){

    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherData = MutableLiveData<NetworkResponse<WeatherResponse>>()
    val weatherData : LiveData<NetworkResponse<WeatherResponse>> = _weatherData

    fun  getData(city : String){

        viewModelScope.launch {
            _weatherData.value = NetworkResponse.Loading
            try {
                val response = weatherApi.getWeather(Constant.apiKey, city)
                if (response.isSuccessful){
                    response.body()?.let {
                        _weatherData.value = NetworkResponse.Success(it)
                    }
                }else{
                    _weatherData.value = NetworkResponse.Error("Failed to Load Data")
                }
            } catch (e : Exception){
                _weatherData.value = NetworkResponse.Error("Failed to Load Data")

            }

        }


    }
}