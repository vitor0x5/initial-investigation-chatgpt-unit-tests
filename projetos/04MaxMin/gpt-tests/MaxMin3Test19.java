package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test19{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
        assertNotNull(maxMin3);
    }

    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = 5;
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, MaxMin3.maxMin3(v1, n1));

        int[] v2 = {5, 4, 3, 2, 1};
        int n2 = 5;
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));

        int[] v3 = {1, 3, 2, 4, 5};
        int n3 = 5;
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, n3));

        int[] v4 = {5, 3, 4, 2, 1};
        int n4 = 5;
        int[] expected4 = {5, 1};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, n4));

        int[] v5 = {1, 2, 3, 4};
        int n5 = 4;
        int[] expected5 = {4, 1};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, n5));

        int[] v6 = {4, 3, 2, 1};
        int n6 = 4;
        int[] expected6 = {4, 1};
        assertArrayEquals(expected6, MaxMin3.maxMin3(v6, n6));

        int[] v7 = {1, 3, 2, 4};
        int n7 = 4;
        int[] expected7 = {4, 1};
        assertArrayEquals(expected7, MaxMin3.maxMin3(v7, n7));

        int[] v8 = {4, 2, 3, 1};
        int n8 = 4;
        int[] expected8 = {4, 1};
        assertArrayEquals(expected8, MaxMin3.maxMin3(v8, n8));
    }
}