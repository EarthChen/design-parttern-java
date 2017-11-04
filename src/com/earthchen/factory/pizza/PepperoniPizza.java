package com.earthchen.factory.pizza;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaingredientFactory;

public class PepperoniPizza extends Pizza {
    private PizzaingredientFactory pizzaingredientFactory;

    public PepperoniPizza(PizzaingredientFactory pizzaingredientFactory) {
        this.pizzaingredientFactory = pizzaingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("preparing " + name);
    }
}
