package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test3{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
        assertNotNull(maxMin1);
    }

    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int[] expected = {5, -5};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test(timeout=1000)
    public void testMaxMin1WithRepeatedValues() throws Exception {
        int[] v = {1, 2, 3, 3, 4, 5};
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test(timeout=1000)
    public void testMaxMin1WithEmptyArray() throws Exception {
        int[] v = {};
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }

    @Test(timeout=1000)
    public void testMaxMin1WithSingleElementArray() throws Exception {
        int[] v = {5};
        int[] expected = {5, 5};
        assertArrayEquals(expected, MaxMin1.maxMin1(v, v.length));
    }
}