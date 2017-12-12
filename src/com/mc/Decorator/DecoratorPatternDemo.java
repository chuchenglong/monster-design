package com.mc.Decorator;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 装饰器模式(Decorator Pattern)
 * @create 2017/11/30 15:57
 * @since v0.1
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape redCircle = new RedShapeDecorator(circle);
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
