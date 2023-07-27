package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test11{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int[] result = MaxMin1.maxMin1(v, 5);
        assertEquals(5, result[0]);
        assertEquals(1, result[1]);
    }

    @Test(timeout=1000)
    public void testMaxMin1_WithNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int[] result = MaxMin1.maxMin1(v, 5);
        assertEquals(-1, result[0]);
        assertEquals(-5, result[1]);
    }

    @Test(timeout=1000)
    public void testMaxMin1_WithRepeatedValues() throws Exception {
        int[] v = {1, 2, 2, 3, 4, 5};
        int[] result = MaxMin1.maxMin1(v, 6);
        assertEquals(5, result[0]);
        assertEquals(1, result[1]);
    }

    

    @Test(timeout=1000)
    public void testMaxMin1_WithSingleElementArray() throws Exception {
        int[] v = {1};
        int[] result = MaxMin1.maxMin1(v, 1);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
    }
}