package com.earthchen.factory.ny;

import com.earthchen.factory.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "ny style sauce and cheese pizza";
        dough = "thin crust dough";
        sauce = "marinara sauce";

        toppings.add("crated reggiano cheese");
    }

}
