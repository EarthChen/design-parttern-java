package com.earthchen.proxy.gumball;

import java.io.Serializable;

/**
 * 实现可序列化的状态接口
 */
public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
