package com.earthchen.iterator.dinnerPancake.test;

import com.earthchen.iterator.dinnerPancake.PancakeHouseMenu;
import com.earthchen.iterator.dinnerPancake.Waitress;

public class MenuTestDrive {

    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
