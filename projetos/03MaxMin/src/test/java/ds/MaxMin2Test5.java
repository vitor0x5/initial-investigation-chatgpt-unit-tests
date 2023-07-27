package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test5{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
    }

    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {5, 3, 9, 2, 1};
        int n = v.length;
        int[] expected = {9, 1};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithNegativeValues() throws Exception {
        int[] v = {-5, -3, -9, -2, -1};
        int n = v.length;
        int[] expected = {-1, -9};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    

    @Test(timeout=1000)
    public void testMaxMin2_WithSingleElementArray() throws Exception {
        int[] v = {5};
        int n = v.length;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithEqualValues() throws Exception {
        int[] v = {5, 5, 5, 5, 5};
        int n = v.length;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin2_WithNegativeAndPositiveValues() throws Exception {
        int[] v = {-5, 3, -9, 2, -1};
        int n = v.length;
        int[] expected = {3, -9};
        assertArrayEquals(expected, MaxMin2.maxMin2(v, n));
    }
}