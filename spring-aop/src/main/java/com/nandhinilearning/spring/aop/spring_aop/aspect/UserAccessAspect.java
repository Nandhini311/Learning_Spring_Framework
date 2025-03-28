package com.nandhinilearning.spring.aop.spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //what kind of method calls I would intercept
    //format (* any return type PACKAGE * [any class] .* .(..) [any parameter])

    @Before("execution(* com.nandhinilearning.spring.aop.spring_aop.data.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info(" Check for user access");
        logger.info("Intercepted Method Call {} ", joinPoint);
    }
}