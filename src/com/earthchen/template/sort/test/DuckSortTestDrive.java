package com.earthchen.template.sort.test;

import com.earthchen.template.sort.Duck;

import java.util.Arrays;

public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("111", 8),
                new Duck("222", 2),
                new Duck("333", 7),
                new Duck("444", 2),
                new Duck("555", 10),
                new Duck("666", 2),
        };

        System.out.println("排序前");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("排序后");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
