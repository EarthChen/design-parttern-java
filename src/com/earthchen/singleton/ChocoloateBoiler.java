package com.earthchen.singleton;

/**
 * 单件模式的巧克力工厂
 */
public class ChocoloateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocoloateBoiler uniqueInstance;

    private ChocoloateBoiler() {
        empty = true;
        boiled = false;
    }


    public static ChocoloateBoiler getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocoloateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
