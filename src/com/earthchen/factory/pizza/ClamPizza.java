package com.earthchen.factory.pizza;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaingredientFactory;

public class ClamPizza extends Pizza {

    private PizzaingredientFactory pizzaingredientFactory;

    public ClamPizza(PizzaingredientFactory pizzaingredientFactory) {
        this.pizzaingredientFactory = pizzaingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("preparing " + name);
        dough = pizzaingredientFactory.createDough();
        sauce = pizzaingredientFactory.createSauce();
        cheese = pizzaingredientFactory.createCheese();
        clams = pizzaingredientFactory.createClam();
    }
}
