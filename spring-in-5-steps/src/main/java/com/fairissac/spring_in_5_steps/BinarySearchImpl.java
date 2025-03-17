package com.fairissac.spring_in_5_steps;

import com.fairissac.spring_in_5_steps.scope.SpringIn5StepsApplicationScope;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class BinarySearchImpl {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private  SortingAlgorithm notificationService;

    public void setService(SortingAlgorithm service) {
        this.notificationService = service;
    }

//    public BinarySearchImpl(SortingAlgorithm sorting){
//       this.sorting = sorting;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        //sort the array
        //search an array
        //return the result.

        //if you ever want to change the sort algorithm, you will have to keep changing the code here as well - this is what is called tightly coupled
        //let's use interface to make this loosely coupled.
        return notificationService.sortMethod(numbers, numberToSearchFor);
    }

    //if you want any set of actions to be performed once all the beans are created/populated,
    @PostConstruct
    public void PostConstruct(){
        LOGGER.info("post construct");
    }

    //if you want any set of actions to be performed once all the beans are destroyed,
    @PreDestroy
    public void PreDestroyed(){
        LOGGER.info("Bean is removed");
    }

}
