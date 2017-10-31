package com.earthchen.observer.impl;



public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 当主题发生改变时，方法被调用，通知所有的观察者
     */
    void notifyObservers();
}
