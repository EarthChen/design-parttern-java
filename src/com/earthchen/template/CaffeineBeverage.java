package com.earthchen.template;

/**
 * 茶和咖啡的饮料超类
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 添加调料
     */
    abstract void addCondiments();

    /**
     * 冲泡
     */
    abstract void brew();

    /**
     * 烧热水
     */
    private void boilWater() {
        System.out.println("boiling water");
    }

    /**
     * 倒入杯子
     */
    private void pourInCup() {
        System.out.println("pouring into cup");
    }
}
