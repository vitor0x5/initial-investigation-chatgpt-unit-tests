package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MaxMin2Test0{


    private MaxMin2 maxMin2;

    @Before
    public void setUp() {
        maxMin2 = new MaxMin2();
    }

    @Test(timeout=1000)
    public void testDefaultConstructor() {
        assertNotNull(maxMin2);
    }

    // Test for maxMin2 method
    @Test(timeout=1000)
    public void testMaxMin2() {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, maxMin2.maxMin2(v, n));
    }

    // Test for maxMin2 method with negative values
    @Test(timeout=1000)
    public void testMaxMin2WithNegativeValues() {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, maxMin2.maxMin2(v, n));
    }

    // Test for maxMin2 method with equal values
    @Test(timeout=1000)
    public void testMaxMin2WithEqualValues() {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expected = {1, 1};
        assertArrayEquals(expected, maxMin2.maxMin2(v, n));
    }

    // Test for maxMin2 method with single element
    @Test(timeout=1000)
    public void testMaxMin2WithSingleElement() {
        int[] v = {10};
        int n = 1;
        int[] expected = {10, 10};
        assertArrayEquals(expected, maxMin2.maxMin2(v, n));
    }
}