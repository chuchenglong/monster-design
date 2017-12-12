package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step12: 实现工厂生产，通过此处来new所需工厂
 * @create 2017/11/27 18:35
 * @since v0.1
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type) {
        if ("COLOR".equalsIgnoreCase(type)) {
            return new ColorFactory();
        } else if ("SHAPE".equalsIgnoreCase(type)) {
            return new ShapeFactory();
        }
        return null;
    }
}
