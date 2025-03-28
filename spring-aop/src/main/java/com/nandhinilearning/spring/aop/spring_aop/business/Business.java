package com.nandhinilearning.spring.aop.spring_aop.business;

import com.nandhinilearning.spring.aop.spring_aop.data.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business {

    @Autowired
    private Dao dao;

    public String CalculateSomething(){
        return dao.retrieveData();
    }
}
