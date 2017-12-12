package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step3: 画圆形
 * @create 2017/11/27 17:58
 * @since v0.1
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw circle !");
    }
}
