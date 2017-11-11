package com.earthchen.facade;

public class HomeTheaterFacade {

    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvdPlayer,
                             CdPlayer cdPlayer,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amp=amp;
        this.tuner=tuner;
        this.dvdPlayer=dvdPlayer;
        this.cdPlayer=cdPlayer;
        this.projector=projector;
        this.screen=screen;
        this.lights=lights;
        this.popper=popper;
    }

    /**
     * 看电影方法将之前手动进行的每项任务依次进行
     * @param movie
     */
    public void watchMovie(String movie){
        System.out.println("准备开始看电影");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }


    /**
     * 结束看电影
     */
    public void endMovie(){
        System.out.println("结束电影");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
