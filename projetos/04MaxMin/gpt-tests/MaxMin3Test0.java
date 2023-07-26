package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test0{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
        assertNotNull(maxMin3);
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3WithNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3WithOddNumberElements() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int[] expected = {6, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3WithBoundaryValues() throws Exception {
        int[] v = {0, 100, -100};
        int n = 3;
        int[] expected = {100, -100};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}