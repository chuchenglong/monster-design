package com.mc.Singleton;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 单例模式(Singleton Pattern)
 * 登记式/静态内部类: 只适用于静态域，lazy加载初始化，线程安全，延迟加载对无内存耗损
 * 关键点:
 * 1) 私有化构造方法，让其使用提供的静态方法new对象。
 * 2) 利用classloader机制保证线程安全，只有一个线程会去加载初始化静态资源。
 * 3) 利用静态内部类保证lazy加载，类被加载时内部类没被主动使用，只有内部类被主动使用时，静态单例才会被加载。
 * @create 2017/11/28 10:59
 * @since v0.1
 */
public class SingletonExample5 {
    private static class Singleton {
        private static final SingletonExample5 singleton = new SingletonExample5();
    }

    private SingletonExample5() {}

    public static final SingletonExample5 getSingleton() {
        return Singleton.singleton;
    }

}
