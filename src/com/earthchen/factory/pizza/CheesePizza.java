package com.earthchen.factory.pizza;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaingredientFactory;

public class CheesePizza extends Pizza {

    private PizzaingredientFactory pizzaingredientFactory;

    public CheesePizza(PizzaingredientFactory pizzaingredientFactory){
        this.pizzaingredientFactory=pizzaingredientFactory;
    }


    @Override
    protected void prepare() {
        System.out.println("preparing"+name);
        dough=pizzaingredientFactory.createDough();
        sauce=pizzaingredientFactory.createSauce();
        cheese=pizzaingredientFactory.createCheese();
    }
}
