package com.mc.Builder;

/**
 * @author ChenglongChu
 * @description 创建类设计模式 - 建造者模式(Builder Pattern)
 * @create 2017/11/28 15:12
 * @since v0.1
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareChickenMeal();
        meal.showItems();
        System.out.println(meal.getCost());

        Meal meal2 = mealBuilder.prepareVegMeal();
        meal2.showItems();
        System.out.println(meal2.getCost());
    }
}
