package com.fairissac.spring_core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm{
    public int sortMethod(int[] array, int value){
        System.out.println("Using Bubble Sort Algorithm");
        return 8;
    }

}
