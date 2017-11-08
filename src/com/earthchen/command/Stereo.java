package com.earthchen.command;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name=name;
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void setCD() {
        System.out.println("stereo cd");
    }

    public void setVolume() {
        System.out.println("stereo volume");
    }
}
