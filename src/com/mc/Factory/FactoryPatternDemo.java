package com.mc.Factory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 工厂模式(Factory Pattern)
 * step5: 案例演示
 * @create 2017/11/27 18:04
 * @since v0.1
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape("CIRCLE");
        circle.draw();

        Shape rectangle = factory.createShape("RECTANGLE");
        rectangle.draw();

        Shape square = factory.createShape("SQUARE");
        square.draw();
    }
}
