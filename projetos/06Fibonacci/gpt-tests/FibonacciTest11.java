package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest11{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    // Test cases for the fibIter method

    @Test(timeout = 1000)
    public void testFibIterWithZero() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithPositiveNumber() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithNegativeNumber() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithBoundaryValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MAX_VALUE);
        // Verify that the result is within the valid range
        assertTrue(result >= 0);
    }
}