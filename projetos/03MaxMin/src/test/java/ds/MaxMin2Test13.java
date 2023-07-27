package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test13{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
        assertNotNull(maxMin2);
    }

    @Test(timeout = 1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int n = 5;
        int[] expected = {5, -4};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithPositiveValues() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithBoundaryValues() throws Exception {
        int[] v = {0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int n = 3;
        int[] expected = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }
}