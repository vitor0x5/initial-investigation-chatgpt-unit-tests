package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test8{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 obj = new MaxMin4();
        assertNotNull(obj);
    }

    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, -4};

        int[] result = MaxMin4.maxMin4(v, linf, lsup);

        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin4WithEqualValues() throws Exception {
        int[] v = {2, 2, 2, 2};
        int linf = 0;
        int lsup = 3;
        int[] expected = {2, 2};

        int[] result = MaxMin4.maxMin4(v, linf, lsup);

        assertArrayEquals(expected, result);
    }
}