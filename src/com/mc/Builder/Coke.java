package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step9: 可口可乐
 * @create 2017/11/28 14:57
 * @since v0.1
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public double price() {
        return 3;
    }
}
