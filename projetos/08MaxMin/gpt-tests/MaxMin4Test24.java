package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test24{


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
    public void testMaxMin4WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithBoundaryValues() throws Exception {
        int[] v = {0, 1, 2, 3, 4};
        int linf = 0;
        int lsup = 4;
        int[] expected = {4, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}