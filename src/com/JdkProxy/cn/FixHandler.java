package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shenlijun on 2016/4/21.
 */
public class FixHandler implements InvocationHandler {
    private Object Object;

    public FixHandler(java.lang.Object object) {
        Object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is the FixHander...");
        method.invoke(Object);
        return null;
    }
}
