package com.earthchen.command.command;

/**
 * 一种新的命令，用来执行一组命令
 */
public class MarcroCommand implements Command {

    // 用命令数组存储一系列命令
    private Command[] commands;

    public MarcroCommand(Command[] commands) {
        this.commands = commands;
    }

    /**
     * 一次性执行数组中的每个命令
     */
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
