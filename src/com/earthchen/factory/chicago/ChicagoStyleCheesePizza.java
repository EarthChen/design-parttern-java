package com.earthchen.factory.chicago;

import com.earthchen.factory.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {


    public ChicagoStyleCheesePizza() {
        name = "Chicago style sauce and cheese pizza";
        dough = "Chicago thin crust dough";
        sauce = " Chicago marinara sauce";

        toppings.add(" Chicago crated reggiano cheese");
    }

    protected void cut() {
        System.out.println("Chicago cutting the pizza into square slices");
    }
}
