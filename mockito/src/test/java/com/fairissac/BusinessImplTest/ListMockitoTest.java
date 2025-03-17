package com.fairissac.BusinessImplTest;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ListMockitoTest {
    @Test
    void test(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    void multipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(3, listMock.size());
        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(1, listMock.size());
    }

    void parameters(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("First Element");
        assertEquals("First Element", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }
}
