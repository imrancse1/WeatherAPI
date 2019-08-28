package com.example.weatherapi;

import com.example.weatherapi.Forcast.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface ForcastWeatherAPIService {

    @GET
    Call<WeatherData> getWeatherData(@Url String endurl);
}
