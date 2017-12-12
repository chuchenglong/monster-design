package com.mc.Bridge;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 桥接模式(Bridge Pattern)
 * step2: 画绿色的圆形
 * @create 2017/11/28 17:29
 * @since v0.1
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("coloe : green, " + "radius:" + radius + ", x :" + x + ", y:" + y);
    }
}
