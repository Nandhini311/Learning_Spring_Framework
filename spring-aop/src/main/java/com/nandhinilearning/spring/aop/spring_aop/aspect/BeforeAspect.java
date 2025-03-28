package com.nandhinilearning.spring.aop.spring_aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Configuration;

@Aspect        //this is related to AOP
@Configuration //to say this is a configurtion
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //what kind of method calls I would intercept
    //format (* any return type PACKAGE * [any class] .* .(..) [any parameter])

    @Before("execution(* com.nandhinilearning.spring.aop.spring_aop.aspect.CommonJoinPointConfig.businessLayerExecutrion")
    public void before(JoinPoint joinPoint){
        logger.info("Intercepted Method Call {} ", joinPoint);
    }
}