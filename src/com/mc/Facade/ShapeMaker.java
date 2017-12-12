package com.mc.Facade;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 外观模式(Facade Pattern)
 * step5: 用外观模式统一接口
 * @create 2017/11/30 16:56
 * @since v0.1
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
