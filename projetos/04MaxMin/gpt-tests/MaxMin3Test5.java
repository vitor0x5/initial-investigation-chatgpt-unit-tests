package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test5{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 obj = new MaxMin3();
    }

    @Test(timeout = 1000)
    public void testMaxMin3() throws Exception {
        // Test case 1: n is odd
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin3.maxMin3(v1, v1.length));

        // Test case 2: n is even
        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, v2.length));

        // Test case 3: n is 0
        int[] v3 = {};
        int[] expected3 = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, v3.length));

        // Test case 4: n is 1
        int[] v4 = {10};
        int[] expected4 = {10, 10};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, v4.length));

        // Test case 5: n is negative
        int[] v5 = {1, 2, 3, 4, 5};
        int[] expected5 = {5, 1};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, -v5.length));

        // Test case 6: All elements in v are the same
        int[] v6 = {1, 1, 1, 1, 1};
        int[] expected6 = {1, 1};
        assertArrayEquals(expected6, MaxMin3.maxMin3(v6, v6.length));

        // Test case 7: Random values in v
        int[] v7 = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int[] expected7 = {9, 1};
        assertArrayEquals(expected7, MaxMin3.maxMin3(v7, v7.length));

        // Test case 8: Random values in v, n is even
        int[] v8 = {9, 8, 7, 6, 5, 4, 3, 2};
        int[] expected8 = {9, 2};
        assertArrayEquals(expected8, MaxMin3.maxMin3(v8, v8.length));
    }
}