package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test10{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3_WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3_WithOddLength() throws Exception {
        int[] v = {1, 3, 5};
        int n = 3;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3_WithEqualValues() throws Exception {
        int[] v = {3, 3, 3};
        int n = 3;
        int[] expected = {3, 3};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3_WithBoundaryValues() throws Exception {
        int[] v = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
        int n = 3;
        int[] expected = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

}