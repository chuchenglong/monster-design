package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step7: 蔬菜汉堡
 * @create 2017/11/28 14:55
 * @since v0.1
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public double price() {
        return 15.05;
    }
}
