package com.wang.spring;

import com.wang.spring.condition.WindowsCondition;
import com.wang.spring.entity.Color;
import com.wang.spring.entity.MyFactoryBean;
import com.wang.spring.entity.Person;
import com.wang.spring.selector.MyImportSeclector;
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
//可以通过import引入第三方没有任何注解的类，bean名称默认为全路径名
@Import(value = {Color.class})
public class MainConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope(value = "singleton")
//    @Scope(value = "prototype") //多例,每次都会new一个新的
    public Person person(){
        System.out.println("创建person");
        return new Person("zhangsan",19);
    }

    @Bean(name = "myFactoryBean")
    public MyFactoryBean factoryBean(){
        return new MyFactoryBean();
    }
}
