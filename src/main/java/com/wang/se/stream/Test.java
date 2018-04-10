package com.wang.se.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by wang on 2018/4/10.
 */
public class Test {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH) );
        List<String> threeHighCaloriesDishNames=menu.stream().filter(dish -> dish.getCalories()>300).map(Dish::getName).limit(3).collect(toList());
        System.out.println(threeHighCaloriesDishNames);
        List<String> vegetarianDishNames=menu.stream().filter(dish -> dish.isVegetarian()).map(Dish::getName).collect(toList());
        System.out.println(vegetarianDishNames);
        Optional<Dish> dish=menu.stream().filter(Dish::isVegetarian).findAny();//找到任意一个就结束
        dish.ifPresent(d-> System.out.println(d.getName()));//如果dish包含值就打印它否则啥都不做


    }
}
