package com.mc.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step2: 女性过滤器
 * @create 2017/11/30 14:39
 * @since v0.1
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<Person>();
        for (Person p : persons) {
            if (p.getGender().equals("female")) {
                result.add(p);
            }
        }
        return result;
    }
}
