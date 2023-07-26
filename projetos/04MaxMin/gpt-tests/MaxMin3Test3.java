package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test3{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
    }

    @Test(timeout = 1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3};
        int n = 3;
        int[] expected = {3, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin3_WithNegativeValues() throws Exception {
        int[] v = {-1, -2, -3};
        int n = 3;
        int[] expected = {-1, -3};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin3_WithEqualValues() throws Exception {
        int[] v = {1, 1, 1};
        int n = 3;
        int[] expected = {1, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin3_WithOddSize() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testMaxMin3_WithEvenSize() throws Exception {
        int[] v = {1, 2, 3, 4};
        int n = 4;
        int[] expected = {4, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}