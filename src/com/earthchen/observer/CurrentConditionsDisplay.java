package com.earthchen.observer;

import com.earthchen.observer.impl.DisplayElement;
import com.earthchen.observer.impl.Observer;
import com.earthchen.observer.impl.Subject;


/**
 * 实现了observer接口，可以从WeatherData对象中获得改变
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 构造器常量weatherData对象(主题)作为注册之用
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 展示数据
     */
    @Override
    public void display() {
        System.out.println("当前观测值为"+temperature+"   "+humidity);

    }

    /**
     * 当update并调用时，将数据保存起来，调用展示方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}
