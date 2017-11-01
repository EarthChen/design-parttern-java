package com.earthchen.javaobserver;

import java.util.Observable;

/**
 * 使用内置的支持实现观察者
 *
 * 使用拉的方式传递数据
 */
public class WeatherData extends Observable {

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {

    }

    /**
     * 在通知观察者之前调用setChanged()表示状态已经改变
     */
    private void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

}
