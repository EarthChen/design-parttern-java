package com.earthchen.command.control;

public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name=name;
    }

    public void up() {
        System.out.println("up");
    }

    public void down(){
        System.out.println("down");
    }

    public void shop(){
        System.out.println("shop");
    }

    public void lightOn(){
        System.out.println("light on");
    }

    public void lightOff(){
        System.out.println("light close");
    }
}
