package com.fairissac.spring_in_5_steps;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

//load the context
@ExtendWith(SpringExtension.class) //this is to tell Junit to use Spring.
@ContextConfiguration(classes=SpringIn5StepsApplication.class)
public class BinarySearchTest {

   //Get this bean from context
    @Autowired
    BinarySearchImpl binarySearch;
    //to get the bean assigned

    @Test
    public void testBasicSearch(){
        int result = binarySearch.binarySearch(new int[]{1,2,3}, 2);
        assertEquals(3, result);
    }
}
