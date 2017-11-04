package com.earthchen.factory;

import com.earthchen.factory.ingredient.*;

import java.util.ArrayList;

public abstract class Pizza {


    public void setName(String name) {
        this.name = name;
    }

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected ArrayList<String> toppings = new ArrayList<>();


    public String getName() {
        return name;
    }

    protected abstract void prepare();

    protected void bake() {
        System.out.println("bake");
    }

    protected void cut() {
        System.out.println("cut");
    }

    protected void box() {
        System.out.println("box");
    }


    @Override
    public String toString() {
        return "abstract pizza name"+name;
    }
}
