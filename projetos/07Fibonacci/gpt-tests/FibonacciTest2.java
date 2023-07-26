package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest2{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout = 1000)
    public void testFibIterPositive() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test(timeout = 1000)
    public void testFibIterNegative() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    @Test(timeout = 1000)
    public void testFibIterZero() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }
}