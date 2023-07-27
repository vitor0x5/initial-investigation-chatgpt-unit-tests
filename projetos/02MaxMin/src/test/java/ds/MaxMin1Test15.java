package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test15{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
        assertNotNull(maxMin1);
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1_AllPositive() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1_AllNegative() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = v.length;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1_PositiveAndNegative() throws Exception {
        int[] v = {-5, -4, 0, 1, 5};
        int n = v.length;
        int[] expected = {5, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1_SingleElement() throws Exception {
        int[] v = {1};
        int n = v.length;
        int[] expected = {1, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}