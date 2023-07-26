package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest21{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
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

        // Test with n = 3
        int result4 = Fibonacci.fibIter(3);
        assertEquals(2, result4);

        // Test with n = 4
        int result5 = Fibonacci.fibIter(4);
        assertEquals(3, result5);

        // Test with n = 5
        int result6 = Fibonacci.fibIter(5);
        assertEquals(5, result6);

        // Test with negative n
        int result7 = Fibonacci.fibIter(-5);
        assertEquals(-5, result7);
    }
}