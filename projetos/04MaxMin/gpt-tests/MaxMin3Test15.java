package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test15{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin3OddLength() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int[] expected = {6, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin3NegativeValues() throws Exception {
        int[] v = {-5, -10, -3, -7, -1};
        int n = 5;
        int[] expected = {-1, -10};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin3BoundaryValues() throws Exception {
        int[] v = {0, 100, 50, 200, 25};
        int n = 5;
        int[] expected = {200, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
}