package com.earthchen.factory.pizza;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaingredientFactory;

public class VeggiePizza extends Pizza {
    private PizzaingredientFactory pizzaingredientFactory;

    public VeggiePizza(PizzaingredientFactory pizzaingredientFactory) {
        this.pizzaingredientFactory = pizzaingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("preparing " + name);
    }
}
