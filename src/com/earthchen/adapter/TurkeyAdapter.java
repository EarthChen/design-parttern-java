package com.earthchen.adapter;

/**
 * 火鸡鸭子适配器
 *
 * 需要实现想转换成的类型接口（客户所期望看到的接口）
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    /**
     * 取得适配器的对象引用
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 因为火鸡的飞行距离比较短，如果想和鸭子飞行距离想对应，必须调用五次火鸡的fly()方法
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
