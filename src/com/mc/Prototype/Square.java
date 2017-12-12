package com.mc.Prototype;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 原型模式(Prototype Pattern)
 * step4: 画方形
 * @create 2017/11/28 15:51
 * @since v0.1
 */
public class Square extends Shape {
    public Square() {
        super.type = "square";
    }
    @Override
    void draw() {
        System.out.println("draw square");
    }
}
