package com.earthchen.decorator;


/**
 *  调料抽象类(装饰者类)
 *  继承扩展饮料类
 */
public abstract class CondimentDecorator extends Beverage{
    /**
     * 所有调料装饰者必须重新实现该方法
     * @return
     */
    public abstract String getDescription();
}
