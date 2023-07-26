package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test17{


    @Test(timeout=1000)
    public void testConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
    }

    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = new int[] {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = new int[] {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithEmptyArray() throws Exception {
        int[] v = new int[] {};
        int linf = 0;
        int lsup = 0;
        int[] expected = new int[] {0, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithSingleElement() throws Exception {
        int[] v = new int[] {5};
        int linf = 0;
        int lsup = 0;
        int[] expected = new int[] {5, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithNegativeValues() throws Exception {
        int[] v = new int[] {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = 4;
        int[] expected = new int[] {-1, -5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithBoundaryValues() throws Exception {
        int[] v = new int[] {0, 1, 2, 3, 4};
        int linf = 0;
        int lsup = 4;
        int[] expected = new int[] {4, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}