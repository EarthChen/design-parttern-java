package com.earthchen.javaobserver;

import com.earthchen.observer.impl.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 展示数据
     */
    @Override
    public void display() {
        System.out.println("当前观测值为" + temperature + "   " + humidity);

    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData=(WeatherData) o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }
}
