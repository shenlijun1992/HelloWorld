package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shenlijun on 2016/4/21.
 */
public class LogHandle implements InvocationHandler {
    private Object logCar;

    public LogHandle(Timehandler carlog) {
        logCar = carlog;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is the logHandler");
        method.invoke(logCar);
        return null;
    }
}
