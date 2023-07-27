package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest14{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout=1000)
    public void testFibIter() throws Exception {
        // Test with n = 0
        assertEquals(0, Fibonacci.fibIter(0));

        // Test with n = 1
        assertEquals(1, Fibonacci.fibIter(1));

        // Test with n = 2
        assertEquals(1, Fibonacci.fibIter(2));

        // Test with n = 3
        assertEquals(2, Fibonacci.fibIter(3));

        // Test with n = 4
        assertEquals(3, Fibonacci.fibIter(4));

        // Test with negative n
        assertEquals(0, Fibonacci.fibIter(-1));

        // Test with large n
        assertEquals(1134903170, Fibonacci.fibIter(45));
    }
}