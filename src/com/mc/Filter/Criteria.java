package com.mc.Filter;

import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step1: 定义过滤器功能
 * @create 2017/11/30 14:08
 * @since v0.1
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
