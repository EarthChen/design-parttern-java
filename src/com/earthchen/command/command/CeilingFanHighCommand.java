package com.earthchen.command.command;

import com.earthchen.command.CeilingFan;

public class CeilingFanHighCommand implements Command {

    //增加局部状态追踪之前的状态
    private CeilingFan ceilingFan;

    private int preSpeed;

    /**
     * 改变速度之前需要先将它之前的状态保存起来，以便撤销时使用
     */
    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();

    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
