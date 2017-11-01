package com.earthchen.decorator.beverage;

import com.earthchen.decorator.Beverage;

/**
 * Espresso饮料继承饮料类 复写描述方法
 */
public class Espresso extends Beverage {

    public String getDescription() {
        return "Espresso";
    }


    @Override
    public double cost() {
        return 8.5;
    }
}
