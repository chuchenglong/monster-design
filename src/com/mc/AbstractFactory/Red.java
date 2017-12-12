package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step7: 填充为红色
 * @create 2017/11/27 18:24
 * @since v0.1
 */
public class Red implements Color{
    @Override
    public void fillColor() {
        System.out.println("Fill red color !");
    }
}
