package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin3Test4{


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
    public void testMaxMin3WithOddN() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 6};
        int n = 6;
        int[] expected = {6, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithNegativeValues() throws Exception {
        int[] v = {-5, 10, -3, 7, -1, 4};
        int n = 6;
        int[] expected = {10, -5};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(expected=ArrayIndexOutOfBoundsException.class, timeout=1000)
    public void testMaxMin3WithInvalidN() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int n = 6;
        MaxMin3.maxMin3(v, n);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithDuplicateMaxValue() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 5};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithDuplicateMinValue() throws Exception {
        int[] v = {1, 2, 3, 4, 1, 5};
        int n = 6;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin3WithMaxAndMinValuesAtEnd() throws Exception {
        int[] v = {1, 2, 3, 4, 5, 0};
        int n = 6;
        int[] expected = {5, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }
    
}