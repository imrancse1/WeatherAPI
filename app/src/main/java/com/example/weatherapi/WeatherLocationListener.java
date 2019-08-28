package com.example.weatherapi;

public interface WeatherLocationListener {
   void getWeatherlocation(double lat, double lon);

   void getCityname(String cname);
}
