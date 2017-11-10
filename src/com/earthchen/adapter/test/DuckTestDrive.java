package com.earthchen.adapter.test;

import com.earthchen.adapter.Duck;
import com.earthchen.adapter.MallardDuck;
import com.earthchen.adapter.TurkeyAdapter;
import com.earthchen.adapter.WildTurkey;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkeys says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck says.....");
        duck.quack();
        duck.fly();

        System.out.println("the turkeyAdapter says....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
