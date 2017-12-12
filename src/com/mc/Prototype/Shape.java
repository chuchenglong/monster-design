package com.mc.Prototype;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 原型模式(Prototype Pattern)
 * step1: 创建一个实现Cloneable接口的抽象类
 * @create 2017/11/28 15:35
 * @since v0.1
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
