package com.mc.Singleton;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 单例模式(Singleton Pattern)
 * 懒汉式-线程不安全: lazy初始化加载，线程不安全，一般不会用
 * 关键点: 私有化构造方法，让其使用提供的静态方法new对象
 * @create 2017/11/28 9:46
 * @since v0.1
 */
public class SingletonExample1 {
    private static SingletonExample1 singleton;

    private SingletonExample1() {}

    public static SingletonExample1 getInstance() {
        if (null == singleton) {
            singleton = new SingletonExample1();
        }
        return singleton;
    }
}
