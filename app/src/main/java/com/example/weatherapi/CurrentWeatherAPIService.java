package com.example.weatherapi;

import com.example.weatherapi.current.WeatherCurrentData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface CurrentWeatherAPIService {
    @GET
    Call<WeatherCurrentData> getWeatherdetails(@Url String endurl);
}
