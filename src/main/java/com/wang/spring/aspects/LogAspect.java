package com.wang.spring.aspects;

import org.aspectj.lang.annotation.*;

/**
 * @Author: wangliujie
 * @Date: 2020/6/2 9:35
 */
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.wang.spring.entity.MathCalculator.*(..))")
    public void pointcut() {
    }
    @Before(value = "pointcut()")
    private void LogStart(){
        System.out.println("LogStart...");
    }

    @After(value = "pointcut()")
    private void LogEnd(){
        System.out.println("LogeEnd...");
    }

    @AfterReturning("pointcut()")
    private void LogReturn(){
        System.out.println("LogReturn...");
    }
    @AfterThrowing("pointcut()")
    private void LogException(){
        System.out.println("LogException...");
    }
}
