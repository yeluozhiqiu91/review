package com.wang.spring;

import com.wang.spring.condition.WindowsCondition;
import com.wang.spring.entity.Color;
import com.wang.spring.entity.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Author: wangliujie
 * @Date: 2020/5/25 21:54
 */
@Configuration
//扫描com.wang.spring包，并且排除@Controller注解
@ComponentScan(value = "com.wang.spring",excludeFilters = {@ComponentScan.Filter(classes = Controller.class)})
//根据条件注入
@Conditional(WindowsCondition.class)
//可以通过import引入第三方没有任何注解的类
@Import(value = Color.class)
public class MainConfig {
    @Bean
    public Person person(){
        return new Person("zhangsan",19);
    }
}
