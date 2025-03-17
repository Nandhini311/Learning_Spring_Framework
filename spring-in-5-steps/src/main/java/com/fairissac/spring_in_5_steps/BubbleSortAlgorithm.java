package com.fairissac.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortingAlgorithm{

    @Override
    public int sortMethod(int[] array, int value) {
        System.out.println("Using BubbleSort Alogirthm");
        return 8;
    }
}
