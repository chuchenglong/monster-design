package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step8: 鸡肉汉堡
 * @create 2017/11/28 14:56
 * @since v0.1
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public double price() {
        return 30.01;
    }
}
