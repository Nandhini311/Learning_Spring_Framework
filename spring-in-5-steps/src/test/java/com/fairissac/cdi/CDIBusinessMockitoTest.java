package com.fairissac.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CDIApplication.class)
public class CDIBusinessMockitoTest {

    @InjectMocks
    CDIBusiness cdiBusiness;

    @Mock
    CDIDAO daoMock;

    @Test
    public void TestCDI(){

        //giving your own sample values
        when(daoMock.getData()).thenReturn(new int[]{2, 4});
        int actualResult = cdiBusiness.findGreatest();
        assertEquals(4, actualResult);
    }
}
