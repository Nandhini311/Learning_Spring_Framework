package com.fairissac.spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype;

@Component
public class BinarySearch {


    @Autowired
    @Qualifier("bubble")
    private SortingAlgorithm notificationService;

    public void setNotificationService(SortingAlgorithm service){
        this.notificationService = service;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        return notificationService.sortMethod(numbers, numberToSearchFor);
    }
}
