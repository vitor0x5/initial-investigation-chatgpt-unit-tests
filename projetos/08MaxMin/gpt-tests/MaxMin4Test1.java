package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test1{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 obj = new MaxMin4();
        assertNotNull(obj);
    }
    
    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = {5, 2, 9, 1, 7};
        int linf = 0;
        int lsup = 4;
        int[] expected = {9, 1};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithEqualValues() throws Exception {
        int[] v = {5, 5, 5, 5, 5};
        int linf = 0;
        int lsup = 4;
        int[] expected = {5, 5};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithNegativeValues() throws Exception {
        int[] v = {-5, -2, -9, -1, -7};
        int linf = 0;
        int lsup = 4;
        int[] expected = {-1, -9};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithBoundaryValues() throws Exception {
        int[] v = {0, 1, 2, 3, 4};
        int linf = 0;
        int lsup = 4;
        int[] expected = {4, 0};
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        assertArrayEquals(expected, result);
    }
}