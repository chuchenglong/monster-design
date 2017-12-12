package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step11: 颜色填充工厂
 * @create 2017/11/27 18:33
 * @since v0.1
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Shape createShape(String type) {
        return null;
    }

    @Override
    Color fillColor(String color) {
        if ("RED".equals(color)) {
            return new Red();
        } else if ("BLUE".equals(color)) {
            return new Blue();
        } else if ("GREEN".equals(color)) {
            return new Green();
        }
        return null;
    }
}
