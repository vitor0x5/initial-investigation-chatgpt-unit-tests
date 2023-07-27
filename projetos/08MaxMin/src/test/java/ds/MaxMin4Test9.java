package ds;import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMin4Test9{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
        assertNotNull(maxMin4);
    }

    @Test(timeout = 1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = v.length - 1;

        int[] maxMin = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(new int[]{5, 1}, maxMin);
    }

    @Test(timeout = 1000)
    public void testMaxMin4MinMaxEqual() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int linf = 0;
        int lsup = v.length - 1;

        int[] maxMin = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(new int[]{1, 1}, maxMin);
    }

    @Test(timeout = 1000)
    public void testMaxMin4BoundaryValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = v.length - 1;

        int[] maxMin = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(new int[]{5, -5}, maxMin);
    }
}