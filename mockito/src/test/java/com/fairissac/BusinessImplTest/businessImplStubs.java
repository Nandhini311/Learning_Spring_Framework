package com.fairissac.BusinessImplTest;
import com.fairissac.mockito.BusinessImpl;
import com.fairissac.mockito.DataService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class businessImplStubs {

    @Test
    void test(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        BusinessImpl business = new BusinessImpl(dataServiceStub);
        var result = business.findtheGreatestFromAllData();
        System.out.println(result);
        assertEquals(15, result );
    }
}

//example class
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{12, 15, 5};
    }
}

//disadvantage
/**
 1. High maintenance - everytime you make change to the interface, you need to update here as well
 let's say a new method is added, even if you don't use it, you will still have to do the implementation here.
 2. Testing more scenarios become very difficult you will have to create new stub everytime you wanna test a new scenario.
**/