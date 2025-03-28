package com.nandhinilearning.spring.aop.spring_aop.data;

import org.springframework.stereotype.Repository;

@Repository //as this talks to the databases
public class Dao {
    public String retrieveData(){
        return "Dao";
    }
}
