package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test13{


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
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3OddN() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int[] expected = {6, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3NegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3BoundaryValues() throws Exception {
        int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 9;
        int[] expected = {9, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3EqualValues() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {1, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}