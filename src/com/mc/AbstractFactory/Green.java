package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step8: 填充为绿色
 * @create 2017/11/27 18:25
 * @since v0.1
 */
public class Green implements Color {
    @Override
    public void fillColor() {
        System.out.println("Fill green color !");
    }
}
