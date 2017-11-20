package com.earthchen.proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            // 如果方法是getter方法，就调用personBean内的方法
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
                // 如果是setHotOrNotRating() 方法，抛出异常表示不允许
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalStateException();
            } else if (method.getName().startsWith("set")) {
                // 因为我们是拥有着，可以调用setter方法
                return method.invoke(personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
