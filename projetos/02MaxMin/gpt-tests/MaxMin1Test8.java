package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test8{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
        assertNotNull(maxMin1);
    }

    @Test(timeout = 1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int n = 5;
        int[] expected = {5, -4};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin1AllPositiveValues() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin1AllNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin1BoundaryValues() throws Exception {
        int[] v = {0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int n = 3;
        int[] expected = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class, timeout = 1000)
    public void testMaxMin1EmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        MaxMin1.maxMin1(v, n);
    }

    @Test(expected = NullPointerException.class, timeout = 1000)
    public void testMaxMin1NullArray() throws Exception {
        int[] v = null;
        int n = 5;
        MaxMin1.maxMin1(v, n);
    }
}