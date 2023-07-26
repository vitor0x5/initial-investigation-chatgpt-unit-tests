package ds;import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest12{


    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
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
    public void testFibIterWithZero() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithBoundaryPositiveValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MAX_VALUE);
        // Assert the expected result using a known Fibonacci number
        assertEquals(1836311903, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithBoundaryNegativeValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MIN_VALUE);
        // Assert the expected result using a known Fibonacci number
        assertEquals(-1134903170, result);
    }
}