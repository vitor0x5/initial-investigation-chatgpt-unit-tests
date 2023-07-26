package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test9{

    
    @Test(timeout=1000, expected=IllegalArgumentException.class)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
    }
    
    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int[] expected = {6, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
        
        int[] v2 = {-5, -4, -3, -2, -1, 0};
        int n2 = 6;
        int[] expected2 = {0, -5};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));
        
        int[] v3 = {5, 4, 3, 2, 1};
        int n3 = 5;
        int[] expected3 = {5, 1};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, n3));
        
        int[] v4 = {10, 20, 30, 40, 50, 60};
        int n4 = 6;
        int[] expected4 = {60, 10};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, n4));
        
        int[] v5 = {-1, 0, 1};
        int n5 = 3;
        int[] expected5 = {1, -1};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, n5));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5, -6};
        int n = 6;
        int[] expected = {-1, -6};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
        
        int[] v2 = {-10, -20, -30, -40, -50, -60};
        int n2 = 6;
        int[] expected2 = {-10, -60};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));
        
        int[] v3 = {0, -1, -2, -3, -4, -5};
        int n3 = 6;
        int[] expected3 = {0, -5};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, n3));
        
        int[] v4 = {-5, -4, -3, -2, -1, 0};
        int n4 = 6;
        int[] expected4 = {0, -5};
        assertArrayEquals(expected4, MaxMin3.maxMin3(v4, n4));
        
        int[] v5 = {-1, 0, 1};
        int n5 = 3;
        int[] expected5 = {1, -1};
        assertArrayEquals(expected5, MaxMin3.maxMin3(v5, n5));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithEmptyArray() throws Exception {
        int[] v = {};
        int n = 0;
        int[] expected = {0, 0};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithSingleElementArray() throws Exception {
        int[] v = {10};
        int n = 1;
        int[] expected = {10, 10};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithTwoElementArray() throws Exception {
        int[] v = {5, 3};
        int n = 2;
        int[] expected = {5, 3};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
        
        int[] v2 = {3, 5};
        int n2 = 2;
        int[] expected2 = {5, 3};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithThreeElementArray() throws Exception {
        int[] v = {10, 5, 8};
        int n = 3;
        int[] expected = {10, 5};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
        
        int[] v2 = {10, 10, 10};
        int n2 = 3;
        int[] expected2 = {10, 10};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));
        
        int[] v3 = {4, 3, 2};
        int n3 = 3;
        int[] expected3 = {4, 2};
        assertArrayEquals(expected3, MaxMin3.maxMin3(v3, n3));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithOddLengthArray() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
        
        int[] v2 = {5, 4, 3, 2, 1};
        int n2 = 5;
        int[] expected2 = {5, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithEvenLengthArray() throws Exception {
        int[] v = {1, 2, 3, 4};
        int n = 4;
        int[] expected = {4, 1};
        assertArrayEquals(expected, MaxMin3.maxMin3(v, n));
        
        int[] v2 = {4, 3, 2, 1};
        int n2 = 4;
        int[] expected2 = {4, 1};
        assertArrayEquals(expected2, MaxMin3.maxMin3(v2, n2));
    }
}