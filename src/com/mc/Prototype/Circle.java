package com.mc.Prototype;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 原型模式(Prototype Pattern)
 * step3: 画圆形
 * @create 2017/11/28 15:50
 * @since v0.1
 */
public class Circle extends Shape {
    public Circle() {
        super.type = "circle";
    }
    @Override
    void draw() {
        System.out.println("draw circle");
    }
}
