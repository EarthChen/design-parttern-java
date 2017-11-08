package com.earthchen.command.control;

import com.earthchen.command.command.Command;
import com.earthchen.command.command.NoCommand;

/**
 * 遥控器类，处理7个开关的命令，使用相应数组记录
 */
public class RemoteControl {

    /**
     * 使用数组存储开关命令
     */
    private Command[] onCommand;
    private Command[] offCommand;

    /**
     * 在构造方法中实例化并将数组初始化为空命令
     */
    public RemoteControl() {
        this.onCommand = new Command[7];
        this.offCommand = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    /**
     * 将命令记录在相应的数组位置
     * @param slot
     * @param onCommand
     * @param offCommamd
     */
    public void setCommand(int slot, Command onCommand, Command offCommamd) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommamd;
    }

    /**
     * 按下开按钮，调用相应的方法
     * @param slot
     */
    public void onButtonWasPushed(int slot) {
        onCommand[slot].execute();
    }


    /**
     * 按下关按钮，调用相应的方法
     * @param slot
     */
    public void offButtonWasPushed(int slot) {
        offCommand[slot].execute();
    }


    /**
     * 打印除每个插槽和它对应的命令
     * @return
     */
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n--------remote control------\n");
        for (int i = 0; i < onCommand.length; i++) {
            stringBuffer.append("[slot").append(i).append("]").append(onCommand[i].getClass().getName()).append(" ").append(offCommand[i].getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
