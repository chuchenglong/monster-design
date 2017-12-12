package com.mc.Flyweight;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 享元模式(Flyweight Pattern)
 * step4: 案例演示
 * @create 2017/11/30 17:09
 * @since v0.1
 */
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        String[] colors = {"red","green","blue"};
        Shape redCircle = ShapeFactory.getCircle("red");
        redCircle.draw();
        Shape red2Circle = ShapeFactory.getCircle("red");
        red2Circle.draw();
        Shape greenCircle = ShapeFactory.getCircle("green");
        greenCircle.draw();
        Shape blueCircle = ShapeFactory.getCircle("blue");
        blueCircle.draw();

    }
}
