package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest12{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout=1000)
    public void testFibIter() throws Exception {
        // Test with positive values
        assertEquals(0, Fibonacci.fibIter(0));
        assertEquals(1, Fibonacci.fibIter(1));
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
        assertEquals(13, Fibonacci.fibIter(7));
        assertEquals(21, Fibonacci.fibIter(8));
        assertEquals(34, Fibonacci.fibIter(9));

        // Test with negative values
        assertEquals(0, Fibonacci.fibIter(-1));
        assertEquals(1, Fibonacci.fibIter(-2));
        assertEquals(-1, Fibonacci.fibIter(-3));
        assertEquals(2, Fibonacci.fibIter(-4));
        assertEquals(-3, Fibonacci.fibIter(-5));
        assertEquals(5, Fibonacci.fibIter(-6));
        assertEquals(-8, Fibonacci.fibIter(-7));
        assertEquals(13, Fibonacci.fibIter(-8));
        assertEquals(-21, Fibonacci.fibIter(-9));

        // Test with boundary values
        assertEquals(0, Fibonacci.fibIter(Integer.MIN_VALUE));
        assertEquals(1, Fibonacci.fibIter(Integer.MIN_VALUE + 1));
        assertEquals(-1, Fibonacci.fibIter(Integer.MAX_VALUE));
        assertEquals(2, Fibonacci.fibIter(Integer.MAX_VALUE - 1));
    }
}