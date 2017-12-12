package com.mc.Factory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 工厂模式(Factory Pattern)
 * step2: 画矩形
 * @create 2017/11/27 17:57
 * @since v0.1
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw rectangle !");
    }
}
