package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin3.maxMin3(v1, 5));

        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, 5));

        int[] v3 = {1, 3, 2, 5, 4};
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, 5));

        int[] v4 = {1, 3, 5, 2, 4};
        int[] expected4 = {5, 1};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, 5));

        int[] v5 = {1, 2, 3};
        int[] expected5 = {3, 1};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, 3));

        int[] v6 = {3, 2, 1};
        int[] expected6 = {3, 1};
        assertArrayEquals(expected6, MaxMin3.maxMin3(v6, 3));

        int[] v7 = {1, 3, 2};
        int[] expected7 = {3, 1};
        assertArrayEquals(expected7, MaxMin3.maxMin3(v7, 3));

        int[] v8 = {1, 2, 3, 4};
        int[] expected8 = {4, 1};
        assertArrayEquals(expected8, MaxMin3.maxMin3(v8, 4));

        int[] v9 = {4, 3, 2, 1};
        int[] expected9 = {4, 1};
        assertArrayEquals(expected9, MaxMin3.maxMin3(v9, 4));

        int[] v10 = {1, 4, 2, 3};
        int[] expected10 = {4, 1};
        assertArrayEquals(expected10, MaxMin3.maxMin3(v10, 4));
    }
}