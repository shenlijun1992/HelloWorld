package com.JdkProxy.cn;

import java.util.Random;

/**
 * Created by shenlijun on 2016/4/21.
 * 真正的对象：即为：被代理的对象
 */
public class Car implements Moveable {
    @Override
    /**
     * 模拟汽车运动，使用随机数，模拟汽车行驶的时间
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
