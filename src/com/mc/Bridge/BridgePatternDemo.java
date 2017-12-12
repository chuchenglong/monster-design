package com.mc.Bridge;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 桥接模式(Bridge Pattern)
 * step6: 案例演示
 * @create 2017/11/28 17:52
 * @since v0.1
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Circle redCircle = new Circle(1,2,3, new RedCircle());
        redCircle.draw();

        Circle greenCircle = new Circle(3,2,1, new GreenCircle());
        greenCircle.draw();
    }
}
