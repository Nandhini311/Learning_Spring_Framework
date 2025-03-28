package com.nandhinilearning.spring.aop.spring_aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String CalculatorSomething(){
        return dao2.retrieveData();
    }
}
