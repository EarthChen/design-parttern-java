package com.earthchen.decorator.test;

import com.earthchen.decorator.Beverage;
import com.earthchen.decorator.beverage.Espresso;
import com.earthchen.decorator.condiment.Mocha;
import com.earthchen.decorator.condiment.Whip;

/**
 * 测试代码
 */
public class StarbuzzCoffee {


    public static void main(String[] args) {
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+"   "+beverage.cost());

        Beverage beverage1=new Espresso();
        beverage1=new Mocha(beverage1);
        beverage1=new Mocha(beverage1);
        beverage1=new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"   "+beverage1.cost());
    }
}
