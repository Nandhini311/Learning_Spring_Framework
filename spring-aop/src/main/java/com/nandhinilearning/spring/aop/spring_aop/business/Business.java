package com.nandhinilearning.spring.aop.spring_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business {

    @Autowired
    private Dao dao;

    public String CalculatorSomething(){
        return dao.retrieveData();
    }
}
