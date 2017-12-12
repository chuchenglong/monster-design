package com.mc.Singleton;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 单例模式(Singleton Pattern)
 * 饿汉式: 非lazy初始化加载，线程安全，执行效率高，但类加载时就初始化了，浪费内存，比较常用，不过容易产生垃圾对象
 * 关键点:
 * 1) 私有化构造方法，让其使用提供的静态方法new对象。
 * 2) 通过classloader机制避免了多线程同步问题。
 * @create 2017/11/28 10:12
 * @since v0.1
 */
public class SingletonExample3 {
    public static SingletonExample3 singleton = new SingletonExample3();

    private SingletonExample3() {}

    public static SingletonExample3 getSingleton() {
        return singleton;
    }
}
