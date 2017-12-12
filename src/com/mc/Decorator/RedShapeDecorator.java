package com.mc.Decorator;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 装饰器模式(Decorator Pattern)
 * @create 2017/11/30 15:53
 * @since v0.1
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decorator) {
        super(decorator);
    }

    public void draw() {
        decorator.draw();
        setRedBorder(decorator);
    }
    private void setRedBorder(Shape decorator) {
        System.out.println("red");
    }
}
