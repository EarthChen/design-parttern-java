package com.earthchen.composite.menu;

import java.util.ArrayList;

public class Menu extends MenuComponent {
    /**
     * 菜单可以有任意数目的孩子，这些孩子都必须属于MenuComponent，使用内部ArrayList记录
     */
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    /**
     * 将给每个菜单一个名字和一个描述
     * @param name
     * @param description
     */
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 将菜单项和其他菜单加入菜单中
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    /**
     * 移除某个菜单
     * @param menuComponent
     */
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    /**
     * 取得某个菜单
     * @param i
     * @return
     */
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    /**
     * 取得菜单的名字
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 取得菜单的描述
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 打印所有菜单的名字和描述
     */
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        for (Object menuComponent1 : menuComponents) {
            MenuComponent menuComponent = (MenuComponent) menuComponent1;
            menuComponent.print();
        }
    }
}
