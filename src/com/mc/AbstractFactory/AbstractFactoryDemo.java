package com.mc.AbstractFactory;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 抽象工厂模式(Abstract Factory Pattern)
 * step13: 案例演示
 * @create 2017/11/28 9:23
 * @since v0.1
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.createShape("SQUARE");
        square.draw();

        Color red = colorFactory.fillColor("RED");
        red.fillColor();

        Color blue = colorFactory.fillColor("BLUE");
        blue.fillColor();

        Color green = colorFactory.fillColor("GREEN");
        green.fillColor();

    }
}
