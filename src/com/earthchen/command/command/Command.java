package com.earthchen.command.command;

/**
 * 命令借口
 *
 * 让所有的命令对象实现相同的包含一个方法的接口
 */
public interface Command {

    void execute();

    void undo();
}
