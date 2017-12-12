package com.mc.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 享元模式(Flyweight Pattern)
 * step3: 创建图形缓存，所有图形从此获取
 * @create 2017/11/30 17:05
 * @since v0.1
 */
public class ShapeFactory {
    private static Map<String, Shape> cache = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        if (cache.get(color) == null) {
            Shape circle = new Circle(color);
            cache.put(color, circle);
            System.out.println("create shape");
            return circle;
        }
        System.out.println("get shape from cache");
        return cache.get(color);
    }
}
