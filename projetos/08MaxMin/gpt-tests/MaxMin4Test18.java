package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test18{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
    }

    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithEmptyArray() throws Exception {
        int[] v = {};
        int linf = 0;
        int lsup = 0;
        int[] expected = {0, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithSingleElement() throws Exception {
        int[] v = {5};
        int linf = 0;
        int lsup = 0;
        int[] expected = {5, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithTwoElementsInAscendingOrder() throws Exception {
        int[] v = {1, 2};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithTwoElementsInDescendingOrder() throws Exception {
        int[] v = {2, 1};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithNegativeValues() throws Exception {
        int[] v = {-5, -2, -3, -1, -4};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithBoundaryValues() throws Exception {
        int[] v = {-100, -50, 0, 50, 100};
        int linf = 0;
        int lsup = 4;
        int[] expected = {100, -100};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}