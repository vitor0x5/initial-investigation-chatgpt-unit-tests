package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test0{


    @Test
    public void testMaxMin4() {
        // Test case 1: lsup - linf <= 1
        int[] v1 = {1, 2, 3};
        int linf1 = 0;
        int lsup1 = 1;
        int[] expected1 = {2, 1};
        assertArrayEquals(expected1, MaxMin4.maxMin4(v1, linf1, lsup1));
        
        // Test case 2: max1 > max2 and min1 < min2
        int[] v2 = {5, 4, 3, 2, 1};
        int linf2 = 0;
        int lsup2 = 4;
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin4.maxMin4(v2, linf2, lsup2));
        
        // Test case 3: max1 < max2 and min1 > min2
        int[] v3 = {1, 2, 3, 4, 5};
        int linf3 = 0;
        int lsup3 = 4;
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin4.maxMin4(v3, linf3, lsup3));
        
        // Test case 4: max1 = max2 and min1 = min2
        int[] v4 = {1, 2, 3, 4, 5};
        int linf4 = 0;
        int lsup4 = 2;
        int[] expected4 = {3, 1};
        assertArrayEquals(expected4, MaxMin4.maxMin4(v4, linf4, lsup4));
    }
}