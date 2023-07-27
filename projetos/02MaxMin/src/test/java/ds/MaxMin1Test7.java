package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test7{


    @Test(timeout=1000)
    public void testDefaultConstructor() {
        try {
            new MaxMin1();
        } catch (Exception e) {
            fail("Test failed: " + e.getMessage());
        }
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
    public void testMaxMin1WithPositiveNumbers() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithNegativeNumbers() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = 5;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithMixedNumbers() throws Exception {
        int[] v = {-1, 0, 1, 2, 3};
        int n = 5;
        int[] expected = {3, -1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithSingleElementArray() throws Exception {
        int[] v = {1};
        int n = 1;
        int[] expected = {1, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }

    @Test(timeout=1000)
    public void testMaxMin1WithSameNumbers() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {1, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}