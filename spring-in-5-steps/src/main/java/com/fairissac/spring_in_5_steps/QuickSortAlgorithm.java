package com.fairissac.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortingAlgorithm{

    @Override
    public int sortMethod(int[] array, int value) {
        System.out.println("Using QuickSort Alogirthm");
        return 4;
    }
}
