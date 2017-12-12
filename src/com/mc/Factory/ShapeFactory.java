package com.mc.Factory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 工厂模式(Factory Pattern)
 * step4: 建造工厂
 * @create 2017/11/27 18:00
 * @since v0.1
 */
public class ShapeFactory {
    public Shape createShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("RECTANGLE".equalsIgnoreCase(type)) {
            return new Rectangle();
        }
        return null;
    }
}
