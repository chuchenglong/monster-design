package com.mc.Facade;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 外观模式(Facade Pattern)
 * step6: 案例演示
 * @create 2017/11/30 16:58
 * @since v0.1
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
