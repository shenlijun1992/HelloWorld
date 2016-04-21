package com.JdkProxy.cn;

import java.util.Random;

/**
 * Created by shenlijun on 2016/4/21.
 * �����Ķ��󣺼�Ϊ��������Ķ���
 */
public class Car implements Moveable {
    @Override
    /**
     * ģ�������˶���ʹ���������ģ��������ʻ��ʱ��
     */
    public void move() {
        long starttime = System.currentTimeMillis();
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Car's time is " + (endtime - starttime));

    }
}
