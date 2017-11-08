package com.earthchen.command;

public class CeilingFan {

    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    private String location;

    // 代表吊扇的速度
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed=OFF;
    }

    /**
     * 设置高转速
     */
    public void high(){
        speed=HIGH;
    }

    /**
     * 设置中转速
     */
    public void medium(){
        speed=MEDIUM;
    }

    /**
     * 设置低转速
     */
    public void low(){
        speed=LOW;
    }

    /**
     * 关闭吊扇
     */
    public void off(){
        speed=OFF;
    }

    /**
     * 得到当前吊扇的速度
     * @return
     */
    public int getSpeed(){
        return speed;
    }
}

