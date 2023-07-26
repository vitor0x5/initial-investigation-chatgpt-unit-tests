package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest19{


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
    public void testFibIterWithBoundaryValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MAX_VALUE);
        // Assert the result based on the expected Fibonacci value for Integer.MAX_VALUE
        assertEquals(1073741823, result);
    }
}