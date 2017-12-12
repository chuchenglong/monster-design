package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step9: 定义抽象工厂，支持图形工厂和颜色填充工厂创建
 * @create 2017/11/27 18:26
 * @since v0.1
 */
public abstract class AbstractFactory {
    abstract Shape createShape(String type);
    abstract Color fillColor(String color);
}
