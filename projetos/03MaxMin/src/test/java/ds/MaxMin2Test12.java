package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 obj = new MaxMin2();
        assertNotNull(obj);
    }

    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin2WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin2WithDuplicateValues() throws Exception {
        int[] v = {1, 2, 2, 3, 4, 5};
        int n = 6;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }


    @Test(timeout=1000)
    public void testMaxMin2WithSingleElement() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin2WithAllEqualElements() throws Exception {
        int[] v = {2, 2, 2, 2, 2};
        int n = 5;
        int[] expected = {2, 2};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }
}