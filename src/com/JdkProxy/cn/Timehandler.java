package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shenlijun on 2016/4/21.
 * Timehandler 实现InvocationHandler，
 * 为了传参数方便，创建了一个参数为Object的构造方法
 */
public class Timehandler implements InvocationHandler {

    private Object traget;

    public Timehandler(Object objects) {
        traget = objects;
    }

    /**
     * @param proxy  被代理的对象
     * @param method 被代理的对象的方法
     * @param args   方法的参数
     * @return object对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Car is starting ...");
        method.invoke(traget, args);
        System.out.println("Car end move ...");
        return null;
    }
}
