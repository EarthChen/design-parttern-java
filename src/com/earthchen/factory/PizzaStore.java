package com.earthchen.factory;

public abstract class PizzaStore {

    /**
     * 该类的子类在createPizza()方法中处理对象的实例化
     * @param type
     * @return
     */
    public Pizza orederPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 实例化pizza的责任放到该方法中
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);


}
