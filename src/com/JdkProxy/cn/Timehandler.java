package com.JdkProxy.cn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by shenlijun on 2016/4/21.
 * Timehandler ʵ��InvocationHandler��
 * Ϊ�˴��������㣬������һ������ΪObject�Ĺ��췽��
 */
public class Timehandler implements InvocationHandler {

    private Object traget;

    public Timehandler(Object objects) {
        traget = objects;
    }

    /**
     * @param proxy  ������Ķ���
     * @param method ������Ķ���ķ���
     * @param args   �����Ĳ���
     * @return object����
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
