package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin1Test0{

    
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin1 maxMin1 = new MaxMin1();
    }
    
    @Test(timeout=1000)
    public void testMaxMin1() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin1WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int n = v.length;
        int[] expected = {-1, -5};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
    
    
    
    @Test(timeout=1000)
    public void testMaxMin1WithSingleElementArray() throws Exception {
        int[] v = {100};
        int n = v.length;
        int[] expected = {100, 100};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin1WithMaxValue() throws Exception {
        int[] v = {Integer.MAX_VALUE, 1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {Integer.MAX_VALUE, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin1WithMinValue() throws Exception {
        int[] v = {Integer.MIN_VALUE, 1, 2, 3, 4, 5};
        int n = v.length;
        int[] expected = {5, Integer.MIN_VALUE};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin1WithRepeatedValues() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int n = v.length;
        int[] expected = {1, 1};
        int[] result = MaxMin1.maxMin1(v, n);
        assertArrayEquals(expected, result);
    }
}