package com.earthchen.factory.test;

import com.earthchen.factory.Pizza;
import com.earthchen.factory.PizzaStore;
import com.earthchen.factory.chicago.ChicagoPizzaStore;
import com.earthchen.factory.ny.NYPizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orederPizza("cheese");
        System.out.println("ethan oredered a "+pizza.getName()+"\n");

        pizza=chicagoStore.orederPizza("cheese");
        System.out.println("joel order a "+pizza.getName()+"\n");
    }
}
