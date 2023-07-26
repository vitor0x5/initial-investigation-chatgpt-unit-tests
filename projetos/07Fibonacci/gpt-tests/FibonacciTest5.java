package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest5{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout = 1000)
    public void testFibIter() throws Exception {
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
        assertEquals(55, Fibonacci.fibIter(10));
        assertEquals(-1, Fibonacci.fibIter(-1));
        assertEquals(-2, Fibonacci.fibIter(-2));
        assertEquals(-3, Fibonacci.fibIter(-3));
        assertEquals(-4, Fibonacci.fibIter(-4));
        assertEquals(-5, Fibonacci.fibIter(-5));
        assertEquals(-6, Fibonacci.fibIter(-6));
        assertEquals(-7, Fibonacci.fibIter(-7));
        assertEquals(-8, Fibonacci.fibIter(-8));
        assertEquals(-9, Fibonacci.fibIter(-9));
        assertEquals(-10, Fibonacci.fibIter(-10));
    }
}