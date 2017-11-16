package com.earthchen.iterator.caffe.test;

import com.earthchen.iterator.caffe.CafeMenu;
import com.earthchen.iterator.caffe.Waitress;
import com.earthchen.iterator.dinnerPancake.DinerMenu;
import com.earthchen.iterator.dinnerPancake.PancakeHouseMenu;

public class MenuTestDrive {

    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}
