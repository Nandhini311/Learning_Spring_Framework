package com.nandhinilearning.spring.aop.spring_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.nandhinilearning.spring.aop.spring_aop.data.*.*(..))")
    public void dataLayerExecution(){}

    @Pointcut("execution(* com.nandhinilearning.spring.aop.spring_aop.business.*.*(..))")
    public void businessLayerExecutrion(){}

    @Pointcut("execution(* com.nandhinilearning.spring.aop.spring_aop.aspect.CommonJoinPointConfig.dataLayerExecution()) " +
            "&& com.nandhinilearning.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecutrion())")
    public void allLayerExecution(){}

    @Pointcut("bean(dao*)")
    public void beanStartingWithDao(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}
}
