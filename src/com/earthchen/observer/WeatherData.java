package com.earthchen.observer;

import com.earthchen.observer.impl.Observer;
import com.earthchen.observer.impl.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    /**
     * 使用arraylist记录观察者
     */
    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 在构造函数中实例化
     */
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 注册观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    /**
     * 判断当前arraylist中是否含有该观察者，有则移除
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 遍历arraylist，调用更新方法
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当观测值得到更新，通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 设置观测值并通知观察者
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
