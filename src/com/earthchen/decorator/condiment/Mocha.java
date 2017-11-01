package com.earthchen.decorator.condiment;

import com.earthchen.decorator.Beverage;
import com.earthchen.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 将饮料和调料的描述都显示出来
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 计算饮料的价格加上调料的价格
     * @return
     */
    @Override
    public double cost() {
        return 2.20 + beverage.cost();
    }
}
