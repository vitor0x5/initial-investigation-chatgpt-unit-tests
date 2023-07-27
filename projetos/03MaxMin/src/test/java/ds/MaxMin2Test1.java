package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
        assertNotNull(maxMin2);
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithPositiveValues() throws Exception {
        int[] v = {5, 10, 15, 20};
        int n = 4;
        int[] expected = {20, 5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithNegativeValues() throws Exception {
        int[] v = {-5, -10, -15, -20};
        int n = 4;
        int[] expected = {-5, -20};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithMixedValues() throws Exception {
        int[] v = {-5, 10, -15, 20};
        int n = 4;
        int[] expected = {20, -15};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithBoundaryValues() throws Exception {
        int[] v = {0, Integer.MAX_VALUE, Integer.MIN_VALUE, 100, -100};
        int n = 5;
        int[] expected = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}