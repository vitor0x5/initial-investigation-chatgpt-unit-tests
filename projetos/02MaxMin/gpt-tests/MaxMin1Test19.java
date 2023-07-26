package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test19{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithPositiveValues() throws Exception {
        int[] v = {10, 20, 30, 40, 50};
        int n = 5;
        int[] expected = {50, 10};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-10, -20, -30, -40, -50};
        int n = 5;
        int[] expected = {-10, -50};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithMixedValues() throws Exception {
        int[] v = {-10, 20, -30, 40, -50};
        int n = 5;
        int[] expected = {40, -50};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}