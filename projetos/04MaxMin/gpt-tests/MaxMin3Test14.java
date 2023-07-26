package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
        assertNotNull(maxMin3);
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {5, 2, 9, 1, 7, 3};
        int n = 6;
        int[] expected = {9, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithNegativeValues() throws Exception {
        int[] v = {-5, -2, -9, -1, -7, -3};
        int n = 6;
        int[] expected = {-1, -9};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithBoundaryValues() throws Exception {
        int[] v = {0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int n = 3;
        int[] expected = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
}