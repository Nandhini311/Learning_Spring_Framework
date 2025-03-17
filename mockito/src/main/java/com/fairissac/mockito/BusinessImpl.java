package com.fairissac.mockito;

public class BusinessImpl {

    private DataService dataService;

    public BusinessImpl(DataService dataService){
        this.dataService = dataService;
    }

    public int findtheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int max = Integer.MIN_VALUE;
        for(int element: data){
            if(element>max){
                max = element;
            }
        }
        return max;
    }
}

