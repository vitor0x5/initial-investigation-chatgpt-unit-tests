package ds.llm;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import ds.MaxMin1;

public class MaxMin1Test {

    private MaxMin1 maxMin1Instance;

    @Before
    public void setUp() throws Exception {
        maxMin1Instance = new MaxMin1();
    }

    // Test the default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        assertNotNull(maxMin1Instance);
    }

    // Test maxMin1 method with all positive values
    @Test(timeout=1000)
    public void testMaxMin1AllPositiveValues() throws Exception {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin1.maxMin1(input, input.length));
    }

    // Test maxMin1 method with all negative values
    @Test(timeout=1000)
    public void testMaxMin1AllNegativeValues() throws Exception {
        int[] input = {-1, -2, -3, -4, -5};
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin1.maxMin1(input, input.length));
    }

    // Test maxMin1 method with both positive and negative values
    @Test(timeout=1000)
    public void testMaxMin1MixedValues() throws Exception {
        int[] input = {-3, -2, 0, 1, 3};
        int[] expected = {3, -3};
        assertArrayEquals(expected, MaxMin1.maxMin1(input, input.length));
    }

    // Test maxMin1 method with all values the same
    @Test(timeout=1000)
    public void testMaxMin1SameValues() throws Exception {
        int[] input = {2, 2, 2, 2, 2};
        int[] expected = {2, 2};
        assertArrayEquals(expected, MaxMin1.maxMin1(input, input.length));
    }
}
