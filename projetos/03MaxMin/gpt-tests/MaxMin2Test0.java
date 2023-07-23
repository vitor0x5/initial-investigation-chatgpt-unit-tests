package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin2Test0{

    
    @Test
    public void testMaxMin2() {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 1};
        int[] result1 = MaxMin2.maxMin2(v1, v1.length);
        assertArrayEquals(expected1, result1);
        
        int[] v2 = {5, 4, 3, 2, 1};
        int[] expected2 = {5, 1};
        int[] result2 = MaxMin2.maxMin2(v2, v2.length);
        assertArrayEquals(expected2, result2);
        
        int[] v3 = {2, 4, 6, 8, 10};
        int[] expected3 = {10, 2};
        int[] result3 = MaxMin2.maxMin2(v3, v3.length);
        assertArrayEquals(expected3, result3);
        
        int[] v4 = {1};
        int[] expected4 = {1, 1};
        int[] result4 = MaxMin2.maxMin2(v4, v4.length);
        assertArrayEquals(expected4, result4);
    }
}