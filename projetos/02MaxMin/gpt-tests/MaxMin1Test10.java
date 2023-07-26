package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test10{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        MaxMin1 obj = new MaxMin1();
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;

        int[] maxMin = MaxMin1.maxMin1(v, n);

        int[] expected = {5, 1};
        assertArrayEquals(expected, maxMin);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = v.length;

        int[] maxMin = MaxMin1.maxMin1(v, n);

        int[] expected = {-1, -5};
        assertArrayEquals(expected, maxMin);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithEqualValues() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int n = v.length;

        int[] maxMin = MaxMin1.maxMin1(v, n);

        int[] expected = {1, 1};
        assertArrayEquals(expected, maxMin);
    }
}