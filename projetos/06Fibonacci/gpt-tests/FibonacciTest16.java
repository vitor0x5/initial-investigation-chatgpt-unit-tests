package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest16{


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
    public void testFibIterWithBoundaryValues() throws Exception {
        int result1 = Fibonacci.fibIter(Integer.MAX_VALUE);
        int result2 = Fibonacci.fibIter(Integer.MIN_VALUE);
        assertEquals(0, result1);
        assertEquals(0, result2);
    }
}