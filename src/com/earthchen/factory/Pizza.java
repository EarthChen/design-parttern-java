package com.earthchen.factory;

import java.util.ArrayList;

public abstract class Pizza {


    protected String name;

    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();


    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("prearing " + name);
        System.out.println("tossing dough..");
        System.out.println("adding sauce..");
        System.out.println("adding toppings:");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    protected void bake() {
        System.out.println("bake");
    }

    protected void cut() {
        System.out.println("cut");
    }

    protected void box() {
        System.out.println("box");
    }
}
