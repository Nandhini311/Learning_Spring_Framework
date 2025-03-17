package com.fairissac.BusinessImplTest;

import com.fairissac.mockito.BusinessImpl;
import com.fairissac.mockito.DataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class businessImplMock {

    //this can be more simplified using annotations.
    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private BusinessImpl businessImpl; //inject the mocks to this object.


    @Test
    void findtheGreatestFromAllData_basicScnario(){
        //DataService dataServiceMock = mock(DataService.class);
        /** mock(DataService.class) creates a mock object but by default will have null for objects or zero vlaue for primitive data types,
         leading to a null pointer exception when your BusinessImpl tries to use it.**/
        //dataServiceMock.retrieveAllData() => new int[]{25, 15, 5} - we can do this by using utility methods
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 15, 5});
        // BusinessImpl businessImpl = new BusinessImpl(dataServiceMock);
        int result = businessImpl.findtheGreatestFromAllData();
        assertEquals(25, result);
    }

}
