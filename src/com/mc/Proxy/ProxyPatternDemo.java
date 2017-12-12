package com.mc.Proxy;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 代理模式(Proxy Pattern)
 * step4: 案例演示
 * @create 2017/11/30 17:47
 * @since v0.1
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("aaa.jpn");
        proxyImage.display();
        System.out.println("");
        proxyImage.display();
    }

}
