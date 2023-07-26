package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

import ds.Fibonacci;

public class FibonacciTest9{


    @Test(expected=Exception.class, timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
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
    public void testFibIterWithZeroValue() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithBoundaryValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, result);
    }
}