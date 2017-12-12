package com.mc.Facade;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 外观模式(Facade Pattern)
 * step3: 定义圆形
 * @create 2017/11/30 16:55
 * @since v0.1
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
