package com.mc.Proxy;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 代理模式(Proxy Pattern)
 * step2: 加载并展示图片
 * @create 2017/11/30 17:43
 * @since v0.1
 */
public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName) {
        loadImage(fileName);
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("display : " + fileName);
    }

    private void loadImage(String fileName) {
        System.out.println("loading : " + fileName);
    }
}
