package com.earthchen.template.hook;

public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 加上条件语句，条件是否成立由钩子方法决定，如果想要，这时才调用
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }


    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling water");
    }

    void pourInCup() {
        System.out.println("pouring into cup");
    }

    /**
     * 在这里定义了一个方法，通常是空的省缺实现，这个方法指挥返回true，不做任何事
     * <p>
     * 这是一个钩子，子类可以覆盖这个方法，但是不见得一定要覆盖
     *
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }


}
