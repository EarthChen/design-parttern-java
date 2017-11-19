package com.earthchen.state.gumballstate;

/**
 * 状态接口，所有状态必须实现
 */
public interface State {

    /**
     * 投入钱
     */
    void insertQuarter();

    /**
     * 退钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
