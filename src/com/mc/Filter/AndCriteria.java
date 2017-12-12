package com.mc.Filter;

import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step6: 合集过滤器
 * @create 2017/11/30 14:43
 * @since v0.1
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> ps = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(ps);
    }
}
