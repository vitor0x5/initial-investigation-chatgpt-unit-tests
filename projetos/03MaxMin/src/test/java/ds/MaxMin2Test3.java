package ds;import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MaxMin2Test3{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 maxMin2 = new MaxMin2();
        assertNotNull(maxMin2);
    }
    
    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int n = 5;
        int[] expectedMaxMin = {5, -4};
        
        int[] result = MaxMin2.maxMin2(v, n);
        
        assertArrayEquals(expectedMaxMin, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin2_AllPositiveValues() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 5;
        int[] expectedMaxMin = {5, 1};
        
        int[] result = MaxMin2.maxMin2(v, n);
        
        assertArrayEquals(expectedMaxMin, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin2_AllNegativeValues() throws Exception {
        int[] v = {-1, -2, -3, -4, -5};
        int n = 5;
        int[] expectedMaxMin = {-1, -5};
        
        int[] result = MaxMin2.maxMin2(v, n);
        
        assertArrayEquals(expectedMaxMin, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin2_SingleElementArray() throws Exception {
        int[] v = {1};
        int n = 1;
        int[] expectedMaxMin = {1, 1};
        
        int[] result = MaxMin2.maxMin2(v, n);
        
        assertArrayEquals(expectedMaxMin, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin2_AllEqualValues() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int n = 5;
        int[] expectedMaxMin = {1, 1};
        
        int[] result = MaxMin2.maxMin2(v, n);
        
        assertArrayEquals(expectedMaxMin, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin2_NegativeAndPositiveValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int n = 11;
        int[] expectedMaxMin = {5, -5};
        
        int[] result = MaxMin2.maxMin2(v, n);
        
        assertArrayEquals(expectedMaxMin, result);
    }
}