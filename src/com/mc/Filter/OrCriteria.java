package com.mc.Filter;

import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step7: 并集过滤器
 * @create 2017/11/30 15:04
 * @since v0.1
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> plist1 = criteria.meetCriteria(persons);
        List<Person> plist2 = otherCriteria.meetCriteria(persons);
        for (Person p : plist1) {
            if (!plist2.contains(p)) {
                plist2.add(p);
            }

        }
        return plist2;
    }
}
