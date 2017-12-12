package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step1: 定义食物产品条目
 * @create 2017/11/28 14:39
 * @since v0.1
 */
public interface Item {
    public String name();

    public double price();

    public Packing packing();
}
