package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {5, -3, 10, 2, 8};
        int n = 5;
        int[] expected = {10, -3};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    

    @Test(timeout=1000)
    public void testMaxMin1WithSingleElementArray() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithAllEqualElements() throws Exception {
        int[] v = {3, 3, 3, 3};
        int n = 4;
        int[] expected = {3, 3};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -3, -10, -2, -8};
        int n = 5;
        int[] expected = {-2, -10};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}