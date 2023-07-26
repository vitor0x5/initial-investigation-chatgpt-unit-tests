package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test25{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
        assertNotNull(maxMin3);
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithBoundaryValues() throws Exception {
        int[] v = {0, 1, 2, 3, 4};
        int n = 5;
        int[] expected = {4, 0};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithSingleElement() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }

    @Test(timeout=1000)
    public void testMaxMin3WithTwoElements() throws Exception {
        int[] v = {5, 2};
        int n = 2;
        int[] expected = {5, 2};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
}