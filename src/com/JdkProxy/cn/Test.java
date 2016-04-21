package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by shenlijun on 2016/4/21.
 * JDK动态代理测试类
 * 通过Proxy类创建代理类，因为实现的是同一个接口Moveable，
 * 所以用Moveable来接收这个代理对象，并且将其进行强制类型转换
 * 最后调用代理类的move方法，因为moveable里有这个move方法
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler h = new Timehandler(car);
        Moveable m = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), h);
        m.move();
    }

}
