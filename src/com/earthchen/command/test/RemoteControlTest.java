package com.earthchen.command.test;

import com.earthchen.command.*;
import com.earthchen.command.command.GarageDoorOpenCommand;
import com.earthchen.command.command.LightOnCommand;
import com.earthchen.command.control.GarageDoor;
import com.earthchen.command.control.SimpleRemoteControl;

/**
 * 命令模式的客户
 */
public class RemoteControlTest {

    public static void main(String[] args){
        /**
         * 遥控器就是调用者，会传入一个命令对象，用来发出请求
         */
        SimpleRemoteControl simpleRemoteControl=new SimpleRemoteControl();

        /**
         * 生成了一个电灯对象，就是请求的接受者
         */
        Light light=new Light("");

        GarageDoor garageDoor=new GarageDoor("");

        /**
         * 创建一个命令，将接受者传递给他
         */
        LightOnCommand lightOnCommand=new LightOnCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);


        /**
         * 把命令传递给调用者
         */
        simpleRemoteControl.setCommand(lightOnCommand);

        /**
         * 模拟按下按钮
         */
        simpleRemoteControl.buttonWasPressed();


        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
