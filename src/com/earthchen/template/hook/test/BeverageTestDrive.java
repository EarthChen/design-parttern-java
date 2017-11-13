package com.earthchen.template.hook.test;


import com.earthchen.template.hook.CoffeeWithHook;

public class BeverageTestDrive {

    public static void main(String[] arg){
        CoffeeWithHook coffeeHook=new CoffeeWithHook();
        System.out.println("制作咖啡。。。。");
        coffeeHook.prepareRecipe();
    }
}
