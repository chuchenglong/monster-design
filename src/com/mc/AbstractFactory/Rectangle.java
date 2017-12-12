package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step2: 画矩形
 * @create 2017/11/27 18:13
 * @since v0.1
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw rectangle !");
    }
}
