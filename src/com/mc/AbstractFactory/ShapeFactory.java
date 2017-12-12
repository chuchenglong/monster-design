package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step10: 图形工厂
 * @create 2017/11/27 18:27
 * @since v0.1
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Shape createShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("SQUARE".equalsIgnoreCase(type)) {
            return new Square();
        }
        return null;
    }

    @Override
    Color fillColor(String color) {
        return null;
    }
}
