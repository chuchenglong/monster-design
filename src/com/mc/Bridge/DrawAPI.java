package com.mc.Bridge;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 桥接模式(Bridge Pattern)
 * step1: 定义画图API，画圆形
 * @create 2017/11/28 17:20
 * @since v0.1
 */
public interface DrawAPI {
    public void drawCircle(int radius, int x, int y);
}
