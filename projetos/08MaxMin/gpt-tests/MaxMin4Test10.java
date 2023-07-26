package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin4Test10{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin4 maxMin4 = new MaxMin4();
        assertNotNull(maxMin4);
    }

    @Test(timeout=1000)
    public void testMaxMin4() throws Exception {
        int[] v = {1, -2, 3, -4, 5};
        int linf = 0;
        int lsup = v.length - 1;
        
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        int[] expectedResult = {5, -4};
        
        assertArrayEquals(expectedResult, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithEqualValues() throws Exception {
        int[] v = {1, 1, 1, 1, 1};
        int linf = 0;
        int lsup = v.length - 1;
        
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        int[] expectedResult = {1, 1};
        
        assertArrayEquals(expectedResult, result);
    }
    
    @Test(timeout=1000)
    public void testMaxMin4WithSingleElement() throws Exception {
        int[] v = {1};
        int linf = 0;
        int lsup = 0;
        
        int[] result = MaxMin4.maxMin4(v, linf, lsup);
        int[] expectedResult = {1, 1};
        
        assertArrayEquals(expectedResult, result);
    }
}