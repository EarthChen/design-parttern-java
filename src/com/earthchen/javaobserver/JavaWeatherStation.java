package com.earthchen.javaobserver;


public class JavaWeatherStation {

    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,35,30.4f);
        weatherData.setMeasurements(85,85,30.4f);

    }
}
