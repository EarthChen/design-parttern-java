package com.earthchen.factory;


import com.earthchen.factory.ingredient.*;

public interface PizzaingredientFactory {
    /**
     * 原料创建方法
     * @return
     */
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
