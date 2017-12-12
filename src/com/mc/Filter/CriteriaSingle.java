package com.mc.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step4: 单身过滤器
 * @create 2017/11/30 14:41
 * @since v0.1
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<Person>();
        for (Person p : persons) {
            if (p.getMaritalStatus().equals("single")) {
                result.add(p);
            }
        }
        return result;
    }
}
