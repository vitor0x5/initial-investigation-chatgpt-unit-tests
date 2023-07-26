package ds;import org.junit.Test;
import static org.junit.Assert.*;

import ds.MaxMin1;

public class MaxMin1Test16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin = new MaxMin1();
        assertNotNull(maxMin);
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int n = v.length;
        int[] expected = {5, -4};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1AllPositive() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1AllNegative() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = v.length;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1EmptyArray() throws Exception {
        int[] v = {};
        int n = v.length;
        int[] expected = {0, 0};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1SingleElementArray() throws Exception {
        int[] v = {10};
        int n = v.length;
        int[] expected = {10, 10};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1LargeArray() throws Exception {
        int[] v = new int[1000000];
        for (int i = 0; i < v.length; i++) {
            v[i] = i;
        }
        int n = v.length;
        int[] expected = {999999, 0};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}