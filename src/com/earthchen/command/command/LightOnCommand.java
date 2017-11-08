package com.earthchen.command.command;

import com.earthchen.command.Light;

public class LightOnCommand implements Command {

    private Light light;

    /**
     * 构造器传入灯泡，保存在实例变量中，
     * 调用execute()时，这个电灯对象就成为接受者，负责接受请求
     *
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 调用接受者对象的on()方法
     */
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
