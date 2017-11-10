package com.earthchen.adapter;


import java.util.Random;

/**
 * 鸭子火鸡适配器
 */
public class DuckAdapter implements Turkey {

    private Duck duck;
    private Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        /**
         * 让鸭子平均五次只飞一次
         */
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
