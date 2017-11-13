package com.earthchen.template;

public class Coffee extends CaffeineBeverage{

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }
}
