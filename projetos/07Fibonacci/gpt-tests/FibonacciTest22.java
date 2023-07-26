package ds;import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciTest22{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    @Test(timeout=1000)
    public void testFibIter() throws Exception {
        // Test with n = 0
        int result1 = Fibonacci.fibIter(0);
        assertEquals(0, result1);

        // Test with n = 1
        int result2 = Fibonacci.fibIter(1);
        assertEquals(1, result2);

        // Test with n = 2
        int result3 = Fibonacci.fibIter(2);
        assertEquals(1, result3);

        // Test with n = 5
        int result4 = Fibonacci.fibIter(5);
        assertEquals(5, result4);

        // Test with n = -5
        int result5 = Fibonacci.fibIter(-5);
        assertEquals(-5, result5);

        // Test with n = 10
        int result6 = Fibonacci.fibIter(10);
        assertEquals(55, result6);

        // Test with n = -10
        int result7 = Fibonacci.fibIter(-10);
        assertEquals(-55, result7);
    }
}