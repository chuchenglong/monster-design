package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * step4: 袋装打包
 * @create 2017/11/28 14:45
 * @since v0.1
 */
public class Wapper implements Packing {

    @Override
    public String pack() {
        return "wapper";
    }
}
