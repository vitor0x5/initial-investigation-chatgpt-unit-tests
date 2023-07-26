package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class MaxMin3Test17{


    // Test for default constructor
    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        MaxMin3 maxMin3 = new MaxMin3();
        assertNotNull(maxMin3);
    }

    // Test for maxMin3 method
    @Test(timeout=1000)
    public void testMaxMin3() throws Exception {
        int[] v = {5, 3, 1, 4, 2};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin3 method with n as odd number
    @Test(timeout=1000)
    public void testMaxMin3OddN() throws Exception {
        int[] v = {5, 3, 1, 4, 2};
        int n = 4;
        int[] expected = {5, 2};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin3 method with v[0] > v[1]
    @Test(timeout=1000)
    public void testMaxMin3V0GreaterThanV1() throws Exception {
        int[] v = {5, 3, 1, 4, 2};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin3 method with v[0] < v[1]
    @Test(timeout=1000)
    public void testMaxMin3V0LessThanV1() throws Exception {
        int[] v = {3, 5, 1, 4, 2};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin3 method with v[i] > v[i+1] and v[i] > max
    @Test(timeout=1000)
    public void testMaxMin3ViGreaterThanViPlus1AndViGreaterThanMax() throws Exception {
        int[] v = {5, 3, 1, 7, 2};
        int n = 5;
        int[] expected = {7, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin3 method with v[i] > v[i+1] and v[i+1] < min
    @Test(timeout=1000)
    public void testMaxMin3ViGreaterThanViPlus1AndViPlus1LessThanMin() throws Exception {
        int[] v = {5, 3, 1, 4, 0};
        int n = 5;
        int[] expected = {5, 0};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    // Test for maxMin3 method with v[i] < min and v[i+1] > max
    @Test(timeout=1000)
    public void testMaxMin3ViLessThanMinAndViPlus1GreaterThanMax() throws Exception {
        int[] v = {1, 3, 5, 4, 2};
        int n = 5;
        int[] expected = {5, 1};
        int[] result = MaxMin3.maxMin3(v, n);
        assertArrayEquals(expected, result);
    }

    
}