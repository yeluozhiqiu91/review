package com.wang.spring;

import com.wang.spring.aspects.LogAspect;
import com.wang.spring.entity.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: wangliujie
 * @Date: 2020/6/2 9:30
 */
@EnableAspectJAutoProxy
@Configuration
public class MainOfAOPConfig {
    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
