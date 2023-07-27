package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMin4Test11{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        new MaxMin4();
    }
    
    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, 2, 3, 4, 5};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithTwoElementsInArray() throws Exception {
        int[] v = {5, 1};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {5, 1};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithNegativeValues() throws Exception {
        int[] v = {-5, -4, -3, -2, -1};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {-1, -5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithBoundaries() throws Exception {
        int[] v = {-5, 0, 5};
        int linf = 0;
        int lsup = v.length - 1;
        int[] expected = {5, -5};
        assertArrayEquals(expected, MaxMin4.maxMin4(v, linf, lsup));
    }
}