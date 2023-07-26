package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test16{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
        assertNotNull(maxMin4);
    }

    // Test for maxMin4 method with lsup - linf <= 1
    @Test(timeout=1000)
    public void testMaxMin4WithLsupMinusLinfLessThanOrEqualTo1() throws Exception {
        int[] v = {5, 10};
        int linf = 0;
        int lsup = 1;
        int[] expected = {10, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin4 method with lsup - linf > 1
    @Test(timeout=1000)
    public void testMaxMin4WithLsupMinusLinfGreaterThan1() throws Exception {
        int[] v = {5, 10, 3, 8, 15};
        int linf = 0;
        int lsup = 4;
        int[] expected = {15, 3};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}