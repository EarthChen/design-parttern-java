package com.earthchen.decorator;

/**
 * 饮料抽象类
 */
public abstract class Beverage {
    private String description = "unknown Beverage";

    public String getDescription() {
         return description;
    }

    public abstract  double cost();
}
