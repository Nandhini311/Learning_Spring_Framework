package com.fairissac.spring_in_5_steps;

public class BinarySearchImpl {

    private  SortingAlgorithm sorting;
    public BinarySearchImpl(SortingAlgorithm sorting){
       this.sorting = sorting;
    }
    public int binarySearch(int[] numbers, int numberToSearchFor){
        //sort the array
        //search an array
        //return the result.

        //if you ever want to change the sort algorithm, you will have to keep changing the code here as well - this is what is called tightly coupled
        //let's use interface to make this loosely coupled.
        return sorting.sortMethod(numbers, numberToSearchFor);
    }
}
