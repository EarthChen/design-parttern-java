package com.earthchen.template.sort;

/**
 * 实现Comparable接口
 *
 * 根据体重排序
 */
public class Duck implements Comparable {

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weight " + weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        return Integer.compare(this.weight, otherDuck.weight);
    }
}
