package com.mc.Prototype;

import java.util.Hashtable;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 原型模式(Prototype Pattern)
 * step5: 初始化图形，提供clone获取图形的方法
 * @create 2017/11/28 15:53
 * @since v0.1
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        return (Shape)shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);

    }
}
