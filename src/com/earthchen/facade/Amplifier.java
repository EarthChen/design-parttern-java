package com.earthchen.facade;

public class Amplifier {
    public void on() {
        System.out.println("on");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("setdvd");
    }

    public void setSurroundSound() {
        System.out.println("setSurroundSound");
    }

    public void off() {
        System.out.println("off");
    }
}
