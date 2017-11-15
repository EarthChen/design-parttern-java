package com.earthchen.iterator.dinnerPancake;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] list;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    /**
     * 检查是否已经遍历所有元素，如果还有元素待遍历，则返回true
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }

    /**
     * 返回数组内的下一项，病递增其位置
     *
     * @return
     */
    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            System.arraycopy(list, position - 1 + 1, list, position - 1, list.length - 1 - (position - 1));
            list[list.length - 1] = null;
        }

    }
}
