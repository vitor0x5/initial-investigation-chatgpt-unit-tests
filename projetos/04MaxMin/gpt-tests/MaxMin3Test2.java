package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test2{


    @Test
    public void testMaxMin3() {
        int[] v1 = {1, 2, 3, 4, 5};
        int n1 = 5;
        int[] result1 = MaxMin3.maxMin3(v1, n1);
        int[] expected1 = {5, 1};
        assertArrayEquals(expected1, result1);

        int[] v2 = {5, 4, 3, 2, 1};
        int n2 = 5;
        int[] result2 = MaxMin3.maxMin3(v2, n2);
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, result2);

        int[] v3 = {3, 5, 1, 4, 2};
        int n3 = 5;
        int[] result3 = MaxMin3.maxMin3(v3, n3);
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, result3);

        int[] v4 = {1, 3, 5, 4, 2};
        int n4 = 5;
        int[] result4 = MaxMin3.maxMin3(v4, n4);
        int[] expected4 = {5, 1};
        assertArrayEquals(expected4, result4);

        int[] v5 = {1};
        int n5 = 1;
        int[] result5 = MaxMin3.maxMin3(v5, n5);
        int[] expected5 = {1, 1};
        assertArrayEquals(expected5, result5);

        int[] v6 = {1, 2};
        int n6 = 2;
        int[] result6 = MaxMin3.maxMin3(v6, n6);
        int[] expected6 = {2, 1};
        assertArrayEquals(expected6, result6);

        int[] v7 = {2, 1};
        int n7 = 2;
        int[] result7 = MaxMin3.maxMin3(v7, n7);
        int[] expected7 = {2, 1};
        assertArrayEquals(expected7, result7);

        int[] v8 = {1, 2, 3, 4};
        int n8 = 4;
        int[] result8 = MaxMin3.maxMin3(v8, n8);
        int[] expected8 = {4, 1};
        assertArrayEquals(expected8, result8);
    }
}