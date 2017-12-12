package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step5: 汉堡通过袋装打包
 * @create 2017/11/28 14:49
 * @since v0.1
 */
public abstract class Burger implements Item {

    @Override
    public abstract double price();

    @Override
    public Packing packing() {
        return new Wapper();
    }
}
