package com.mc.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 过滤器模式(Filter Pattern)
 * step8: 案例演示
 * @create 2017/11/30 15:12
 * @since v0.1
 */
public class FilterPatternDemo {
    public static void main(String[] args) {
        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(single, female);

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("屌丝崔运志", "male", "single"));
        persons.add(new Person("二球崔运志", "male", "married"));
        persons.add(new Person("大美女", "female", "single"));
        persons.add(new Person("已婚美女", "female", "married"));

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
