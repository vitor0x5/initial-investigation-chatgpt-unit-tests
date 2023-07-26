package ds;import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest4{


    // Test for the default constructor
    @Test(timeout = 1000)
    public void testDefaultConstructor() throws Exception {
        Fibonacci fibonacci = new Fibonacci();
        assertNotNull(fibonacci);
    }

    // Test for the fibIter method with positive input value
    @Test(timeout = 1000)
    public void testFibIterWithPositiveInput() throws Exception {
        int result = Fibonacci.fibIter(5);
        assertEquals(5, result);
    }

    // Test for the fibIter method with negative input value
    @Test(timeout = 1000)
    public void testFibIterWithNegativeInput() throws Exception {
        int result = Fibonacci.fibIter(-5);
        assertEquals(-5, result);
    }

    // Test for the fibIter method with boundary value of 0
    @Test(timeout = 1000)
    public void testFibIterWithBoundaryValue0() throws Exception {
        int result = Fibonacci.fibIter(0);
        assertEquals(0, result);
    }

    // Test for the fibIter method with boundary value of 1
    @Test(timeout = 1000)
    public void testFibIterWithBoundaryValue1() throws Exception {
        int result = Fibonacci.fibIter(1);
        assertEquals(1, result);
    }
}