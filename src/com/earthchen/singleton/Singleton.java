package com.earthchen.singleton;

/**
 * 经典的单件模式实现
 *
 * 添加了多线程同步
 */
public class Singleton {

    /**
     * 利用一个静态变量来记录唯一实例
     */
    private volatile static Singleton uniqueInstance;


    /**
     * 其他的有用的实例化变量
     *
     * 只能内部调用
     */
    private Singleton() {
    }

    /**
     * 使用该方法实例化对象，并返回这个实例
     *
     * 首先检查实例是否已经创建了，如果没有，才进行同步（只有第一次会同步）
     * @return
     */
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class){
                if (uniqueInstance==null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
