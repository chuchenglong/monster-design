package com.mc.Flyweight;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 享元模式(Flyweight Pattern)
 * step2: 定义圆形
 * @create 2017/11/30 17:03
 * @since v0.1
 */
public class Circle implements Shape {
    private int radius;
    private int x;
    private int y;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("radius : " + radius + "x :" + x + "y :" + y + "color" + color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
