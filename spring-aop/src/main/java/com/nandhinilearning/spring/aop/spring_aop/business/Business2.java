package com.nandhinilearning.spring.aop.spring_aop.business;

import com.nandhinilearning.spring.aop.spring_aop.data.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String CalculateSomething(){
        return dao2.retrieveData();
    }
}
