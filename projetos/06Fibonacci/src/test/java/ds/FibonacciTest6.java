package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest6{


    @Test(timeout=1000)
    public void testConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout=1000)
    public void testFibIter() throws Exception {
        // Test with positive value
        assertEquals(0, Fibonacci.fibIter(0));
        assertEquals(1, Fibonacci.fibIter(1));
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
        
        // Test with boundary values
        assertEquals(0, Fibonacci.fibIter(Integer.MIN_VALUE));
    }
}