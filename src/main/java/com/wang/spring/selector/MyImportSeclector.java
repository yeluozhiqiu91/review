package com.wang.spring.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: wangliujie
 * @Date: 2020/5/28 9:29
 */
public class MyImportSeclector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.wang.spring.entity.Color","com.wang.spring.entity.Person"};
    }
}
