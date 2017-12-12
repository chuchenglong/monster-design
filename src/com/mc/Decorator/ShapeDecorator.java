package com.mc.Decorator;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 装饰器模式(Decorator Pattern)
 * @create 2017/11/30 15:47
 * @since v0.1
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decorator;
    public ShapeDecorator(Shape decorator) {
        this.decorator = decorator;
    }

    public void draw() {
        decorator.draw();
    }
}
