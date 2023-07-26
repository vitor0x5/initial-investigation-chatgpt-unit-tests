package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
        assertNotNull(maxMin1);
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin1WithBoundaryValues() throws Exception {
        int[] v = {-100, 0, 100};
        int n = 3;
        int[] expected = {100, -100};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, n));
    }
}