import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
    @Test
    void test(){
        boolean test = todos.contains("AWS");
        assertEquals(true, test);
        //assertEquals(2, todos.size(), "not of correct size");
        assertTrue(test); //only for boolean values
        //assertArrayEquals();
        //assertNull();
    }
}
