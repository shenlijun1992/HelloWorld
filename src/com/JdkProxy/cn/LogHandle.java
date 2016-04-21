package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shenlijun on 2016/4/21.
 */
public class LogHandle implements InvocationHandler {
    private Object Carlog;

    public LogHandle(Timehandler carlog) {
        Carlog = carlog;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("this is the logHandler");
        method.invoke(Carlog);
        return null;
    }
}
