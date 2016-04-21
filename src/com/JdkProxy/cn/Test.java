package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by shenlijun on 2016/4/21.
 * JDK动态代理测试类
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new Timehandler(car);
        Moveable m = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), h);
        m.move();
    }

}
