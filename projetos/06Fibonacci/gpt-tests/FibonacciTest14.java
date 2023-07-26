package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    @Test(timeout=1000)
    public void testFibIterWithNegativeInput() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithZeroInput() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithPositiveInput() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test(timeout=1000)
    public void testFibIterWithBoundaryValues() throws Exception {
        int result1 = Fibonacci.fibIter(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, result1);

        int result2 = Fibonacci.fibIter(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, result2);
    }
}