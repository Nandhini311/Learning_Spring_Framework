import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private  MyMath math = new MyMath();

    @Test
    public void nullArrayTest(){
        int expected_result = 0;
        assertEquals(expected_result, math.calculator(new int[] {}));
        //absence of failure is success.
        //test condition or assert
    }

    @Test
    public void test() {
        int expected_result = 6 ;
        assertEquals(expected_result, math.calculator(new int[] {1,2,3}));
    }
}
