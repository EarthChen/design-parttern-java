package com.earthchen.factory.ny;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaStore;
import com.earthchen.factory.PizzaingredientFactory;
import com.earthchen.factory.pizza.CheesePizza;
import com.earthchen.factory.pizza.ClamPizza;
import com.earthchen.factory.pizza.PepperoniPizza;
import com.earthchen.factory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaingredientFactory pizzaingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(pizzaingredientFactory);
                pizza.setName("new york style cheese pizza");
            case "veggie":
                pizza = new VeggiePizza(pizzaingredientFactory);
                pizza.setName("new york style cheese pizza");
            case "clam":
                pizza = new ClamPizza(pizzaingredientFactory);
                pizza.setName("new york style cheese pizza");
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaingredientFactory);
                pizza.setName("new york style cheese pizza");

        }
        return pizza;
    }
}
