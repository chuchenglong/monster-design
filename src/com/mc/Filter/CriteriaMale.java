package com.mc.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step3: 男性过滤器
 * @create 2017/11/30 14:14
 * @since v0.1
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<Person>();
        for (Person p : persons) {
            if (p.getGender().equals("male")) {
                result.add(p);
            }
        }
        return result;
    }
}
