package com.nandhinilearning.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {
    //most power advice out of all
    //can control when and how the target method executes
    //it can change the method's return value, catch & handle exceptions.
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("execution(* com.nandhinilearning.spring.aop.spring_aop.business.*.*(..))")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed(); //to run the original method
        long finishTime = System.currentTimeMillis() - startTime;
        logger.info("Method takes {} milliseconds", finishTime);
    }
}
