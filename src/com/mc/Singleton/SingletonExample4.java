package com.mc.Singleton;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 单例模式(Singleton Pattern)
 * DCL(double-checked locking)双重检验锁: lazy初始化加载，线程安全，现实难度相对较为复杂，高性能
 * 关键点:
 * 1) 私有化构造方法，让其使用提供的静态方法new对象。
 * 2) 使用volatile关键词定义单例对象，volatile关键词有可见性和有序性（非完全有序，基于该实例的有序，能保证前后，但无法保证单前/单后的有序）,无原子性。
 * 3) jdk1.5以后才能使用，1.5之前volatile有bug。
 * @create 2017/11/28 10:49
 * @since v0.1
 */
public class SingletonExample4 {
    public static volatile SingletonExample4 singleton;

    private SingletonExample4() {}

    public static SingletonExample4 getSingleton() {
        // 此处先检查，避免锁
        if (null == singleton) {
            //此处锁类，检查单例对象
            synchronized (SingletonExample4.class) {
                if (null == singleton) {
                    singleton = new SingletonExample4();
                }
            }
        }
        return singleton;
    }
}
