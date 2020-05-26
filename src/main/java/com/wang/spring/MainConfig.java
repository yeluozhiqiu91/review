package com.wang.spring;

import com.wang.spring.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wangliujie
 * @Date: 2020/5/25 21:54
 */
@Configuration
@ComponentScan(value = "com.wang.spring")
public class MainConfig {
    @Bean
    public Person person(){
        return new Person("zhangsan",19);
    }
}
