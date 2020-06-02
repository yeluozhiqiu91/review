package com.wang.spring;

import com.wang.spring.entity.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Author: wangliujie
 * @Date: 2020/6/1 11:25
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public Color color(){
        return new Color();
    }
}
