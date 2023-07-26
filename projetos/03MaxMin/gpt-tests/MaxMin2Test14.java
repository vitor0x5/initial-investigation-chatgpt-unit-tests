package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test14{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
        assertNotNull(maxMin2);
    }

    @Test(timeout = 1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithNegativeValues() throws Exception {
        int[] v = {-5, -10, -15, -20, -25};
        int n = 5;
        int[] expected = {-5, -25};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithDuplicateValues() throws Exception {
        int[] v = {1, 2, 2, 3, 4, 5};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin2WithBoundaryValues() throws Exception {
        int[] v = {-100, 0, 100};
        int n = 3;
        int[] expected = {100, -100};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}