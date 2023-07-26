package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin1Test6{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        // Test default constructor
        MaxMin1 maxMin1 = new MaxMin1();
    }

    @Test(timeout = 1000)
    public void testMaxMin1() throws Exception {
        // Test with positive values
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = v1.length;
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin1.maxMin1(v1, n1));

        // Test with negative values
        int[] v2 = {-5, -4, -3, -2, -1};
        int n2 = v2.length;
        int[] expected2 = {-1, -5};
        assertArrayEquals(expected2, MaxMin1.maxMin1(v2, n2));

        // Test with positive and negative values
        int[] v3 = {-5, -4, 3, 2, -1};
        int n3 = v3.length;
        int[] expected3 = {3, -5};
        assertArrayEquals(expected3, MaxMin1.maxMin1(v3, n3));

        // Test with boundary values
        int[] v4 = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int n4 = v4.length;
        int[] expected4 = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertArrayEquals(expected4, MaxMin1.maxMin1(v4, n4));
    }
}