package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest18{

    
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
        // Test the result here
    }
    
    // Add more test cases for each method in the Fibonacci class
    
}