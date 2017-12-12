package com.mc.Singleton;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 单例模式(Singleton Pattern)
 * 懒汉式-线程安全: lazy初始化加载，线程安全，但因为有锁，性能太差，一般不会用
 * 关键点:
 * 1) 私有化构造方法，让其使用提供的静态方法new对象。
 * 2) 通过锁解决多线程安全问题。
 * @create 2017/11/28 10:00
 * @since v0.1
 */
public class SingletonExample2 {
    private static SingletonExample2 singleton;

    private SingletonExample2() {}

    public static synchronized SingletonExample2 getSingleton() {
        if (null == singleton) {
            singleton = new SingletonExample2();
        }
        return singleton;
    }
}
