package com.nandhinilearning.spring.aop.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "execution(* com.nandhinilearning.spring.aop.spring_aop.business.*.*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "execution(* com.nandhinilearning.spring.aop.spring_aop.business.*.*(..))",
            throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("{} throwing exception{}", joinPoint, exception);
    }

    @After(value = "execution(* com.nandhinilearning.spring.aop.spring_aop.business.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        logger.info("{} is executed", joinPoint);
    }
}
