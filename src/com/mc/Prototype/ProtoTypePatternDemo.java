package com.mc.Prototype;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 原型模式(Prototype Pattern)
 * step6: 案例演示
 * @create 2017/11/28 16:23
 * @since v0.1
 */
public class ProtoTypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.println(circle.getType());

        Shape rectangle = ShapeCache.getShape("2");
        System.out.println(rectangle.getType());

        Shape square = ShapeCache.getShape("3");
        System.out.println(square.getType());
    }
}
