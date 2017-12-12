package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step10: 百事可乐
 * @create 2017/11/28 14:58
 * @since v0.1
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public double price() {
        return 2;
    }
}
