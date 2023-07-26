package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 obj = new MaxMin1();
        assertNotNull(obj);
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {2, 5, -3, 10, 8};
        int n = 5;
        int[] expected = {10, -3};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithAllPositiveValues() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithAllNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithBoundaryValues() throws Exception {
        int[] v = {-100, 0, 100};
        int n = 3;
        int[] expected = {100, -100};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}