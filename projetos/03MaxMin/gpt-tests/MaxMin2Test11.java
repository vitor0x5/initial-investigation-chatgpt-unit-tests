package ds;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test11{

    
    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
       MaxMin2 maxMin = new MaxMin2();
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin2_AllPositiveNumbers() throws Exception {
        int v[] = {1, 5, 9, 3, 7};
        int n = v.length;
        int expected[] = {9, 1};
        int result[] = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin2_AllNegativeNumbers() throws Exception {
        int v[] = {-1, -5, -9, -3, -7};
        int n = v.length;
        int expected[] = {-1, -9};
        int result[] = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin2_PositiveAndNegativeNumbers() throws Exception {
        int v[] = {1, -5, 9, -3, 7};
        int n = v.length;
        int expected[] = {9, -5};
        int result[] = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin2_PositiveAndZeroValues() throws Exception {
        int v[] = {1, -5, 0, 3, 7};
        int n = v.length;
        int expected[] = {7, -5};
        int result[] = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(expected = Exception.class, timeout = 1000)
    public void testMaxMin2_NegativeAndZeroValues() throws Exception {
        int v[] = {-1, -5, 0, -3, -7};
        int n = v.length;
        int expected[] = {0, -7};
        int result[] = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
}