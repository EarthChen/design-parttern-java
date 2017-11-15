package com.earthchen.iterator.dinnerPancake;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    /**
     * 检查是否已经遍历所有元素，如果还有元素待遍历，则返回true
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    /**
     * 返回数组内的下一项，病递增其位置
     *
     * @return
     */
    @Override
    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }


}
