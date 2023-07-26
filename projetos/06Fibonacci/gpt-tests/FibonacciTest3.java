package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest3{


    @Test(expected = Exception.class, timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
    }

    @Test(timeout = 1000)
    public void testFibIterWithValidInput() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithNegativeInput() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithZeroInput() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    @Test(timeout = 1000)
    public void testFibIterWithBoundaryValue() throws Exception {
        int result = Fibonacci.fibIter(Integer.MAX_VALUE);
        assertEquals(0, result);
    }
}
