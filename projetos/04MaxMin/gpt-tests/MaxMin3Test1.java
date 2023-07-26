package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test1{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
        
        assertNotNull(maxMin3);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3_NegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = 5;
        
        int[] expected = {-1, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3_BoundaryValues() throws Exception {
        int[] v = {0, 0, 0, 0, 0};
        int n = 5;
        
        int[] expected = {0, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3_SingleElementArray() throws Exception {
        int[] v = {10};
        int n = 1;
        
        int[] expected = {10, 10};
        int[] result = MaxMin3.maxMin3(v, n);
        
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3_TwoElementArray() throws Exception {
        int[] v = {5, 10};
        int n = 2;
        
        int[] expected = {10, 5};
        int[] result = MaxMin3.maxMin3(v, n);
        
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3_ThreeElementArray() throws Exception {
        int[] v = {10, 5, 15};
        int n = 3;
        
        int[] expected = {15, 5};
        int[] result = MaxMin3.maxMin3(v, n);
        
        assertArrayEquals(expected, result);
    }
}