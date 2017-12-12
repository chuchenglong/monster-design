package com.mc.Factory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 工厂模式(Factory Pattern)
 * step3: 画圆
 * @create 2017/11/27 17:58
 * @since v0.1
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw circle !");
    }
}
