package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step6: 冷饮通过瓶装打包
 * @create 2017/11/28 14:51
 * @since v0.1
 */
public abstract class ColdDrink implements Item {

    public abstract double price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
