package com.mc.Composite;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 组合模式(Composite Pattern)
 * step2: 案例演示
 * @create 2017/11/30 15:29
 * @since v0.1
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        ceo.getSubordinates().add(headSales);
        ceo.getSubordinates().add(headMarketing);

        headMarketing.getSubordinates().add(clerk1);
        headMarketing.getSubordinates().add(clerk2);

        headSales.getSubordinates().add(salesExecutive1);
        headSales.getSubordinates().add(salesExecutive2);

        System.out.println(ceo.toString());

        for (Employee one : ceo.getSubordinates()) {
            System.out.println(one.toString());
            for (Employee two : one.getSubordinates()) {
                System.out.println(two.toString());
            }
        }
    }
}
