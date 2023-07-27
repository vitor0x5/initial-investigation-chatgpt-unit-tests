package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test5{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
    }

    @Test(timeout = 1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4BoundaryValues() throws Exception {
        int[] v = {-5, 0, 5};
        int linf = 0;
        int lsup = 2;
        int[] expected = {5, -5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin4SingleElementArray() throws Exception {
        int[] v = {1};
        int linf = 0;
        int lsup = 0;
        int[] expected = {1, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}