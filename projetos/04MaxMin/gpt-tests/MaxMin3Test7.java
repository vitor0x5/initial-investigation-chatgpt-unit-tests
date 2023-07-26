package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test7{


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
    public void testMaxMin3WithEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] expected = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3WithNegativeValues() throws Exception {
        int[] v = {-5, -10, 0, -15};
        int n = 4;
        int[] expected = {0, -15};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3WithPositiveAndNegativeValues() throws Exception {
        int[] v = {-10, -2, 5, -3, 7, 1};
        int n = 6;
        int[] expected = {7, -10};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class, timeout=1000)
    public void testMaxMin3WithOddLengthArray() throws Exception {
        int[] v = {1, 2, 3};
        int n = 3;
        MaxMin3.maxMin3(v, n);
    }
}