package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin2Test2{

    
    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin2 obj = new MaxMin2();
    }
    
    // Test for maxMin2 method with valid inputs
    @Test(timeout=1000)
    public void testMaxMin2() throws Exception {
        int[] v = {5, 2, 9, 1, 7};
        int n = 5;
        int[] expected = {9, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    // Test for maxMin2 method with v[i] > max condition
    @Test(timeout=1000)
    public void testMaxMin2_VGreaterThanMax() throws Exception {
        int[] v = {5, 2, 9, 1, 7};
        int n = 5;
        int[] expected = {9, 1};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    // Test for maxMin2 method with v[i] < min condition
    @Test(timeout=1000)
    public void testMaxMin2_VLessThanMin() throws Exception {
        int[] v = {5, 2, 9, 1, -7};
        int n = 5;
        int[] expected = {9, -7};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    // Test for maxMin2 method with n = 1
    @Test(timeout=1000)
    public void testMaxMin2_NEquals1() throws Exception {
        int[] v = {5};
        int n = 1;
        int[] expected = {5, 5};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
    
    // Test for maxMin2 method with positive and negative values
    @Test(timeout=1000)
    public void testMaxMin2_PositiveAndNegativeValues() throws Exception {
        int[] v = {5, -2, 9, -1, 7};
        int n = 5;
        int[] expected = {9, -2};
        int[] result = MaxMin2.maxMin2(v, n);
        assertArrayEquals(expected, result);
    }
}