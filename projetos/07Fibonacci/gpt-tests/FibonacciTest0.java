package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest0{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout = 1000)
    public void testFibIter_PositiveNumber() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test(timeout = 1000)
    public void testFibIter_NegativeNumber() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    @Test(timeout = 1000)
    public void testFibIter_Zero() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }
}