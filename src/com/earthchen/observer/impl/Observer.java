package com.earthchen.observer.impl;

public interface Observer {
    /**
     * 当观测值发生改变时，主题会把状态值当做方法参数传递给观察者
     *
     *
     * 所有的观察者必须实现该方法
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp,float humidity,float pressure);
}
