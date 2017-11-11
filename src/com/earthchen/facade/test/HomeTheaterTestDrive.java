package com.earthchen.facade.test;

import com.earthchen.facade.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                screen,
                lights,
                popper);

        homeTheaterFacade.watchMovie("raiders of the lost ark");
        homeTheaterFacade.endMovie();

    }
}
