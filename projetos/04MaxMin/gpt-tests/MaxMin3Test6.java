package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test6{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 test = new MaxMin3();
        assertNotNull(test);
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        // Test case with n = 1 and v[0] > v[1]
        int[] v1 = {5, 3};
        int n1 = 1;
        int[] expected1 = {5, 3};
        assertArrayEquals(expected1, MaxMin3.maxMin3(v1, n1));

        // Test case with n = 1 and v[0] < v[1]
        int[] v2 = {3, 5};
        int n2 = 1;
        int[] expected2 = {5, 3};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));

        // Test case with n > 1 and v[i] > v[i+1]
        int[] v3 = {5, 3, 4, 2, 1};
        int n3 = 5;
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, n3));

        // Test case with n > 1 and v[i] < v[i+1]
        int[] v4 = {1, 2, 3, 4, 5};
        int n4 = 5;
        int[] expected4 = {5, 1};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, n4));

        // Test case with n > 1 and n is odd
        int[] v5 = {2, 4, 6, 8, 10, 12, 14};
        int n5 = 7;
        int[] expected5 = {14, 2};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, n5));

        // Test case with n > 1 and n is even
        int[] v6 = {1, 3, 5, 7, 9, 11, 13, 15};
        int n6 = 8;
        int[] expected6 = {15, 1};
        assertArrayEquals(expected6, MaxMin3.maxMin3(v6, n6));
    }
}