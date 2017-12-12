package com.mc.Prototype;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 原型模式(Prototype Pattern)
 * step2: 画矩形
 * @create 2017/11/28 15:48
 * @since v0.1
 */
public class Rectangle extends Shape {
    public Rectangle() {
        super.type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("draw rectangle !");
    }
}
