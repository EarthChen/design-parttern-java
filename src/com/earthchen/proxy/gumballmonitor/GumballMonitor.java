package com.earthchen.proxy.gumballmonitor;

/**
 * 糖果监视器
 */
public class GumballMonitor {

    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    /**
     * 将位置 库存 机器状态打印出来
     */
    public void report(){
        System.out.println("Gumball Machine: " + gumballMachine.getLocation());
        System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Current state: " + gumballMachine.getState());
    }
}
