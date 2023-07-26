package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test9{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 mm1 = new MaxMin1();
        assertNotNull(mm1);
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {3, 1, 5, 2, 4};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        int[] expected = {5, 1};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-3, -1, -5, -2, -4};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        int[] expected = {-1, -5};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithBoundaryValues() throws Exception {
        int[] v = {0, 0, 0, 0, 0};
        int n = 5;
        int[] result = MaxMin1.maxMin1(v, n);
        int[] expected = {0, 0};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1EmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] result = MaxMin1.maxMin1(v, n);
        int[] expected = {0, 0};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1SingletonArray() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] result = MaxMin1.maxMin1(v, n);
        int[] expected = {5, 5};
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1MultipleOccurrences() throws Exception {
        int[] v = {3, 1, 5, 2, 4, 5, 3, 5};
        int n = 8;
        int[] result = MaxMin1.maxMin1(v, n);
        int[] expected = {5, 1};
        assertArrayEquals(expected, result);
    }
}