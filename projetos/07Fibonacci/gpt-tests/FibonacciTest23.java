package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest23{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    @Test(timeout=1000)
    public void testFibIterWithPositiveValue() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithNegativeValue() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithZero() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithMaxIntValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MAX_VALUE);
        // Test case for boundary value
        // Expected result may vary depending on the implementation
        // Modify the expected result accordingly
        assertEquals(0, result);
    }
}