package com.earthchen.command.command;


/**
 * 空命令对象，
 * <p>
 * 当你不想返回一个又意义的对象时，空对象就很有用，客户也可以将处理null的责任转移给空对象，遥控器不可能一出厂就设置了有意义的命令对象，所以提供了NoCommadn对象作为代用品，当调用它的execute()方法时，这种对象什么事情都不做。
 */
public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
