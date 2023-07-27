package ds;import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest2{


    @Test(timeout=1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        // No need to assert anything for default constructor
    }

    @Test(timeout=1000)
    public void testFibIterWithPositiveValues() throws Exception {
        assertEquals(0, Fibonacci.fibIter(0));
        assertEquals(1, Fibonacci.fibIter(1));
        assertEquals(1, Fibonacci.fibIter(2));
        assertEquals(2, Fibonacci.fibIter(3));
        assertEquals(3, Fibonacci.fibIter(4));
        assertEquals(5, Fibonacci.fibIter(5));
        assertEquals(8, Fibonacci.fibIter(6));
    }

    @Test(timeout=1000)
    public void testFibIterWithNegativeValues() throws Exception {
        assertEquals(0, Fibonacci.fibIter(-1));
    }
}