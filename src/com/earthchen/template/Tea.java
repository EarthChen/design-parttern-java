package com.earthchen.template;

public class Tea extends CaffeineBeverage{


    @Override
    void addCondiments() {
        System.out.println("adding lemon");
    }

    @Override
    void brew() {
        System.out.println("steeping the tea");
    }
}
