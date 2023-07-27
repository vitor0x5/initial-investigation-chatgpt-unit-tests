package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test24{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
        assertNotNull(maxMin1);
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
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithDuplicateValues() throws Exception {
        int[] v = {1, 2, 3, 3, 4, 5};
        int n = 6;
        int[] expected = {5, 1};
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
    public void testMaxMin1WithLargeArray() throws Exception {
        int[] v = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            v[i] = i;
        }
        int n = 1000000;
        int[] expected = {999999, 0};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}