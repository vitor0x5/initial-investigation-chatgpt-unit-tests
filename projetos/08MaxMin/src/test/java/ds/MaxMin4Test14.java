package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test14{


    @Test
    public void testDefaultConstructor() {
        MaxMin4 maxMin4 = new MaxMin4();
        assertNotNull(maxMin4);
    }

    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test(timeout=1000)
    public void testMaxMin4WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test(timeout=1000)
    public void testMaxMin4WithBoundaryValues() throws Exception {
        int[] v = {0, 1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 5;
        int[] expected = {5, 0};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test(timeout=1000)
    public void testMaxMin4WithSingleElement() throws Exception {
        int[] v = {1};
        int linf = 0;
        int lsup = 0;
        int[] expected = {1, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test(timeout=1000)
    public void testMaxMin4WithTwoElementsInOrder() throws Exception {
        int[] v = {1, 2};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }

    @Test(timeout=1000)
    public void testMaxMin4WithTwoElementsOutOfOrder() throws Exception {
        int[] v = {2, 1};
        int linf = 0;
        int lsup = 1;
        int[] expected = {2, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
}