package com.earthchen.factory.ny;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaStore;

public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
