package com.earthchen.factory.ny;

import com.earthchen.factory.PizzaingredientFactory;
import com.earthchen.factory.ingredient.*;
import com.earthchen.factory.veggies.Garlic;
import com.earthchen.factory.veggies.MushRoom;
import com.earthchen.factory.veggies.Onion;
import com.earthchen.factory.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaingredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new MushRoom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
