package com.mc.Decorator;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 装饰器模式(Decorator Pattern)
 * @create 2017/11/30 15:45
 * @since v0.1
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
