package com.earthchen.decorator.condiment;

import com.earthchen.decorator.Beverage;
import com.earthchen.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 将饮料和调料的描述都显示出来
     * @return
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * 计算饮料的价格加上调料的价格
     * @return
     */
    @Override
    public double cost() {
        return 8.88 + beverage.cost();
    }
}
