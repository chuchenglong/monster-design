package com.mc.Bridge;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 桥接模式(Bridge Pattern)
 * step5: 画圆形，构造半径、圆心坐标和画图工具
 * @create 2017/11/28 17:44
 * @since v0.1
 */
public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI1) {
        super(drawAPI1);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
