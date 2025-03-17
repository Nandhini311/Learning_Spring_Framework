import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBeforeAfterTest {

    //order of test can be anything but if you anything to be done before the test begins, you can do that
    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }

    //after each
    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }

    //common method to be executed once everything is run. we have beforeAll as well
    @AfterAll
    static void after(){
        System.out.println("AfterAll");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @Test
    void test3(){
        System.out.println("test3");
    }
}
