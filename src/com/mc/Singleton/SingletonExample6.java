package com.mc.Singleton;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 单例模式(Singleton Pattern)
 * 枚举式: 非lazy初始化加载，线程安全，不能通过反射来调用私有构造方法，支持序列化机制
 * 关键点:
 * 1) jdk1.5之后才有枚举
 * @create 2017/11/28 11:52
 * @since v0.1
 */
public enum SingletonExample6 {
    SINGLETON;

    public void whateverMethod() {}
}
