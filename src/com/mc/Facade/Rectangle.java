package com.mc.Facade;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 外观模式(Facade Pattern)
 * step2: 定义矩形
 * @create 2017/11/30 16:02
 * @since v0.1
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
