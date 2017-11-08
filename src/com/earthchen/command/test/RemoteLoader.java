package com.earthchen.command.test;

import com.earthchen.command.*;
import com.earthchen.command.command.*;
import com.earthchen.command.control.GarageDoor;
import com.earthchen.command.control.RemoteControl;
import com.earthchen.command.control.RemoteControlWithUndo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        System.out.println(remoteControl);

        // 同时执行一组命令
        Command[] partyOn = {kitchenLightOn, garageDoorOpen, stereoOnWithCD};
        MarcroCommand partyOnMacro=new MarcroCommand(partyOn);
        remoteControl.setCommand(1,partyOnMacro,partyOnMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

    }


}
