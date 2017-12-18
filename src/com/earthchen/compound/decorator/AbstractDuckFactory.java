package com.earthchen.compound.decorator;

import com.earthchen.compound.duck.Quackable;

/**
 * 生产鸭子的抽象工厂模式
 */
public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckDuck();
    public abstract Quackable createRubberDuck();

}
