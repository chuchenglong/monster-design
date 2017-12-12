package com.mc.Bridge;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 桥接模式(Bridge Pattern)
 * step3: 画红色的圆形
 * @create 2017/11/28 17:24
 * @since v0.1
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("coloe : red, " + "radius:" + radius + ", x :" + x + ", y:" + y);
    }
}
