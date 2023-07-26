package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test4{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 mm = new MaxMin1();
        assertNotNull(mm);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(5, result[0]);
        assertEquals(1, result[1]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(-1, result[0]);
        assertEquals(-5, result[1]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin1WithMixedValues() throws Exception {
        int[] v = {-5, 2, -3, 4, -1};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(4, result[0]);
        assertEquals(-5, result[1]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin1WithDuplicateValues() throws Exception {
        int[] v = {1, 2, 3, 3, 2};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(3, result[0]);
        assertEquals(1, result[1]);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin1WithBoundaryValues() throws Exception {
        int[] v = {-1000000, 0, 1000000};
        int n = 3;
        int[] result = MaxMin1.maxMin1(v, n);
        assertEquals(1000000, result[0]);
        assertEquals(-1000000, result[1]);
    }
}