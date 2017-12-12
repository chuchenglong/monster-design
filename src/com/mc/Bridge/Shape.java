package com.mc.Bridge;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 桥接模式(Bridge Pattern)
 * step4: 定义抽象形状，构造画图API
 * @create 2017/11/28 17:33
 * @since v0.1
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
