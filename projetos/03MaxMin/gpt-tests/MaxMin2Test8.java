package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
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
    public void testMaxMin2_AllPositive() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_AllNegative() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_PositiveAndNegative() throws Exception {
        int[] v = {-5, -2, 0, 3, 7};
        int n = 5;
        int[] expected = {7, -5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_NegativeAndPositive() throws Exception {
        int[] v = {5, 2, 0, -3, -7};
        int n = 5;
        int[] expected = {5, -7};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin2_OnlyOneElement() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}