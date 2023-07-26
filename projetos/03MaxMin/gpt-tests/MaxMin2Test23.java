package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
        assertNotNull(maxMin2);
    }

    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithDuplicateValues() throws Exception {
        int[] v = {1, 2, 3, 3, 4, 5};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2WithSingleValue() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}