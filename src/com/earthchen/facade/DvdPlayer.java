package com.earthchen.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("on");
    }

    public void play(String movie) {
        System.out.println("play");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void eject() {
        System.out.println("eject");
    }

    public void off() {
        System.out.println("off");
    }
}
