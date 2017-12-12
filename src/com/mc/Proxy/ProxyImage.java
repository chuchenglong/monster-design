package com.mc.Proxy;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 代理模式(Proxy Pattern)
 * step3: 用代理展示图片
 * @create 2017/11/30 17:45
 * @since v0.1
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
