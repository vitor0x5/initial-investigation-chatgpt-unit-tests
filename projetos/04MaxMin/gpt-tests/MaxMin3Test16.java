package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test16{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
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
    public void testMaxMin3_NegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin3_BoundaryValues() throws Exception {
        int[] v = {0, 100, 50, 75, 25};
        int n = 5;
        int[] expected = {100, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}