package com.wang.spring.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: wangliujie
 * @Date: 2020/5/28 15:51
 */
public class MyFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
