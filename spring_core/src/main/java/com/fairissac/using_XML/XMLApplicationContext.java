package com.fairissac.using_XML;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLApplicationContext {
    private static Logger LOGGER = LoggerFactory.getLogger(XMLApplicationContext.class);
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml")){
            LOGGER.info("Beans Loadded -> {}", (Object) applicationContext.getBeanDefinitionNames());
            //this logger info accepts a variable, so when we pass an array  only the first element gets printed, so convert it
            // into an arary by typecasting it into an Object
            XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);
            System.out.println(personDAO.getJdbcConnection());
        }
    }
}
